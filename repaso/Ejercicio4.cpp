
//Se quiere hacer un sistema de gestión de pacientes en una clínica. 
//Cada paciente tiene los siguientes datos: nombre, edad, número de historia clínica, 
//y fecha de próxima cita (día, mes y año como una estructura de tipo Fecha). El sistema debe permitir:
//Registrar nuevos pacientes y asignarles una fecha de cita.
//Cancelar una cita buscando al paciente por número de historia clínica.
//Mostrar todas las citas programadas para un día específico.
//Buscar y mostrar información de un paciente usando su número de historia clínica.

#include <iostream>
#include <vector>
#include <string>

using namespace std;

struct fecha {
    int dia, mes, anio;
};

struct paciente {
    string nombre;
    int edad, nroHisClinica;
    struct fecha proxCita;
};

void registrarPaciente(vector<paciente> &pacientes) {
    paciente pac;
    string seguir;
    cout << "Desea registrar a un nuevo paciente? (SI|NO): ";
    cin >> seguir;

    while(seguir == "SI") {
        cout << "Ingrese el nombre del paciente: ";
        cin >> pac.nombre;
        cout << "Ingrese la edad del paciente: ";
        cin >> pac.edad;
        cout << "Ingrese el nro de historia clinica del paciente: ";
        cin >> pac.nroHisClinica;
        cout << "Su proxima cita es el dia: ";
        cin >> pac.proxCita.dia >> pac.proxCita.mes >> pac.proxCita.anio;
        pacientes.push_back(pac);

        cout << "Desea registrar otro paciente? (SI|NO): ";
        cin >> seguir;
    }
}

int buscarPaciente(vector<paciente> &pacientes, int nroHisClinica) {
    for (int i = 0; i < pacientes.size(); i++) {
        if (pacientes[i].nroHisClinica == nroHisClinica) {
            return i;
        }
    }
    return -1;
}

void cancelarCita(vector<struct paciente> &pacientes) {
    int nroHisClinica;
    cout << "Ingrese el numero de historia clinica del paciente cuya cita desea cancelar: ";
    cin >> nroHisClinica;

    int pos = buscarPaciente(pacientes, nroHisClinica);

    if (pos == -1) {
        cout << "El paciente no existe" << endl;
    } else {
        pacientes[pos].proxCita.dia = 0;
        pacientes[pos].proxCita.mes = 0;
        pacientes[pos].proxCita.anio = 0;
        cout << "Cita cancelada. " << pacientes[pos].nombre << endl;
    }
}

void citas(vector<struct paciente> &pacientes) {
    int dia, mes, anio;
    cout << "Ingrese el dia para ver las citas: ";
    cin >> dia >> mes >> anio;

    bool citasEncontradas = false;
    for (const auto &pac : pacientes) {
        if (pac.proxCita.dia == dia && pac.proxCita.mes == mes && pac.proxCita.anio == anio) {
            cout << "Cita programada para: " << pac.nombre << " (" << pac.edad << " anios), Historia Clinica: " << pac.nroHisClinica << endl;
            citasEncontradas = true;
        }
    }

    if (!citasEncontradas) {
        cout << "No hay citas programadas para esa fecha." << endl;
    }
}

void mostrarPaciente(vector<struct paciente> &pacientes) {
    int nroHisClinica;
    cout << "Ingrese el numero de historia clinica del paciente para mostrar la informacion: ";
    cin >> nroHisClinica;

    int pos = buscarPaciente(pacientes, nroHisClinica);

    if (pos == -1) {
        cout << "El paciente no existe." << endl;
    } else {
        cout << "Nombre: " << pacientes[pos].nombre << endl;
        cout << "Edad: " << pacientes[pos].edad << endl;
        cout << "Proxima cita: " << pacientes[pos].proxCita.dia << "/" << pacientes[pos].proxCita.mes << "/" << pacientes[pos].proxCita.anio << endl;
    }
}

int main() {
    vector<struct paciente> pacientes;
    pacientes.push_back({"Alejo", 20, 3});
    vector<struct fecha> fechas;
    fechas.push_back({1, 4, 2024});
    int opcion = 0;

    while(opcion != 5) {
        cout << "Ingrese la opcion deseada:" << endl;
        cout << "1) Registrar paciente" << endl;
        cout << "2) Cancelar cita" << endl;
        cout << "3) Mostrar citas programadas" << endl;
        cout << "4) Mostrar informacion del paciente" << endl;
        cout << "5) Salir" << endl;
        cin >> opcion;

        switch(opcion) {
            case 1:
                registrarPaciente(pacientes);
                break;
            case 2:
                cancelarCita(pacientes);
                break;
            case 3:
                citas(pacientes);
                break;
            case 4:
                mostrarPaciente(pacientes);
                break;
            case 5:
                cout << "Saliendo del sistema" << endl;
                break;
            default:
                cout << "Opcion no valida." << endl;
        }
    }

    return 0;
}