function getbillet() {
    let film = $("#film").val();
    let antall = $("#antall").val();
    let fornavn = $("#fornavn").val();
    let etternavn = $("#etternavn").val();
    let tlf = $("#tlf").val();
    let epost = $("#epost").val();

    let valid = true;

    // validering for filmer
    if (!film) {
        $("#filmerror").text("Vennligst velg en film");
        valid = false;
    } else {
        $("#filmerror").text("");
    }

    // validering for riktig antall
    if (antall <= 0) {
        $("#antallerror").text("Velg riktig antall");
        valid = false;
    } else {
        $("#antallerror").text("");
    }

    // validering av fornavn
    if (!fornavn) {
        $("#fornavnerror").text("Skriv inn riktig navn");
        valid = false;
    } else {
        $("#fornavnerror").text("");
    }

    // validering av etternavn
    if (!etternavn) {
        $("#etternavnerror").text("Skriv inn riktig etternavn");
        valid = false;
    } else {
        $("#etternavnerror").text("");
    }

    // validering av telefonnummer med regex
    const tlfnr = /^[0-9]{8,12}$/;
    if (!tlfnr.test(tlf)) {
        $("#tlfnrerror").text("Skriv inn riktig telefonnr!");
        valid = false;
    } else {
        $("#tlfnrerror").text("");
    }

    // validering av e-post med regex
    const Epost = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!Epost.test(epost)) {
        $("#eposterror").text("Skriv inn riktig epost");
        valid = false;
    } else {
        $("#eposterror").text("");
    }

    if (valid) {
        const billet = {
            film: film,
            antall: antall,
            fornavn: fornavn,
            etternavn: etternavn,
            tlf: tlf,
            epost: epost
        };
        $.post("/lagre",billet, function (){
            VisBiletter();
        });
        nullstill();
    }
}
function VisBiletter(){
    $.post("/hentAlleBilletter",function (data){
        billettregister(data);
    });
}

function slett(){
    $.post("/slettBilletter",function (data){
        billettregister(data);
    });
}

function billettregister(billetter) {
    let ut = "<table class='table table-striped table-bordered'><tr>" +
        "<th> Film </th><th> Antall </th><th> Fornavn </th><th> Etternavn </th><th> Telefonnr</th><th> Epost </th>" +
        "</tr>";
    for(const billet of billetter){
        ut += "<tr>";
        ut += " <td> " + billet.film + " </td><td> " + billet.antall + " </td><td> " + billet.fornavn +
            " </td><td> " + billet.etternavn + " </td><td> " + billet.tlf + " </td><td> " + billet.epost + "</td>";
        ut += "</tr>";
    }
    ut += "</table>";
    $("#VisBilletter").html(ut);
}

function nullstill() {
    // Nullstill inputboksene
    $("#film").val("");
    $("#antall").val("");
    $("#fornavn").val("");
    $("#etternavn").val("");
    $("#tlf").val("");
    $("#epost").val("");
}


