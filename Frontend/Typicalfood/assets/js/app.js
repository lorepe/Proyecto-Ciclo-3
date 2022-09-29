
// SWEETALERT RESTAURANTES

function guardarRestaurante() {


    Swal.fire({
        title: "",
        text: "El restaurante se ha registrado con éxito.",
        icon: "success",
        confirmButtonColor: "#ffaf01",
        confirmButtonText: "Aceptar",
    });

}


function editarRestaurante() {


    Swal.fire({
        title: "",
        text: "El restaurante se ha actualizado con éxito.",
        icon: "success",
        confirmButtonColor: "#ffaf01",
        confirmButtonText: "Aceptar",
    });

}

function eliminarRestaurante() {
    Swal.fire({
        title: "",
        text: "¿Deseas eliminar este restaurante?",
        icon: "question",
        showCancelButton: true,
        confirmButtonColor: "#ffaf01",
        cancelButtonColor: "#f17228",
        confirmButtonText: "Eliminar",
        cancelButtonText: "Cancelar",
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire({
                title: "",
                text: "El restaurante ha sido eliminado.",
                icon: "success",
                confirmButtonColor: "#ffaf01",
                confirmButtonText: "Aceptar",
            }
            );
        }
    });
}


// SWEETALERT PLATILLOS
function guardarPlatillo() {


    Swal.fire({
        title: "",
        text: "El platillo se ha registrado con éxito.",
        icon: "success",
        confirmButtonColor: "#ffaf01",
        confirmButtonText: "Aceptar",
    });

}


function editarPlatillo() {


    Swal.fire({
        title: "",
        text: "El platillo se ha actualizado con éxito.",
        icon: "success",
        confirmButtonColor: "#ffaf01",
        confirmButtonText: "Aceptar",
    });

}

function eliminarPlatillo() {
    Swal.fire({
        title: "",
        text: "¿Deseas eliminar este platillo?",
        icon: "question",
        showCancelButton: true,
        confirmButtonColor: "#ffaf01",
        cancelButtonColor: "#f17228",
        confirmButtonText: "Eliminar",
        cancelButtonText: "Cancelar",
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire({
                title: "",
                text: "El platillo ha sido eliminado.",
                icon: "success",
                confirmButtonColor: "#ffaf01",
                confirmButtonText: "Aceptar",
            }
            );
        }
    });
}


// SWEETALERT RESTAURANTES
function cerrarSesion() {
    Swal.fire({
        title: "",
        text: "¿Deseas cerrar la sesión?",
        icon: "question",
        showCancelButton: true,
        confirmButtonColor: "#ffaf01",
        cancelButtonColor: "#f17228",
        confirmButtonText: "Cerrar sesión",
        cancelButtonText: "Cancelar",
    }).then((result) => {
        if (result.isConfirmed) {
            window.location.href = "index.html";
        }
    });
}