import {Container, Typography, Button, Stack} from "@mui/material";
import React, {useState, useMemo, useEffect} from "react";
import {useTranslation} from "react-i18next";
import {OverviewTable} from "@starwit/react-starwit";
import AddressRest from "../../services/AddressRest";
import {useHistory} from "react-router";
import {addressOverviewFields} from "../../modifiers/AddressModifier";

function AddressOverview() {
    const [selected, setSelected] = useState(undefined);
    const {t} = useTranslation();
    const addressRest = useMemo(() => new AddressRest(), []);
    const history = useHistory();
    const [addressAll, setAddressAll] = useState();

    useEffect(() => {
        reload();
    }, []);

    function reload() {
        addressRest.findAll().then(response => {
            setAddressAll(response.data);
        });
    }

    function goToCreate() {
        history.push("/address/create");
    }

    function goToUpdate() {
        if (!!selected) {
            history.push("/address/update/" + selected.id);
            setSelected(undefined);
        }
    }

    function handleDelete() {
        if (!!selected) {
            addressRest.delete(selected.id).then(reload);
            setSelected(undefined);
        }
    }

    return (
        <Container>
            <Typography variant={"h2"} gutterBottom>{t("address.title")}</Typography>
            <Stack spacing={2} direction={"row"}>
                <Button onClick={goToCreate} variant="contained" color="secondary">{t("button.create")}</Button>
                <Button onClick={goToUpdate} variant="contained" color="secondary" disabled={!selected?.id} >
                    {t("button.update")}
                </Button>
                <Button onClick={handleDelete} variant="contained" color="secondary" disabled={!selected?.id}>
                    {t("button.delete")}
                </Button>
            </Stack>
            <OverviewTable
                entities={addressAll}
                prefix={"address"}
                selected={selected}
                onSelect={setSelected}
                fields={addressOverviewFields}/>
        </Container>
    );
}

export default AddressOverview;
