#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Equipo
{
    string nombre;
    vector<string> jugadores;
    int puntaje_total;
};

void registrar_equipo(string nombre, vector<string> jugadores, vector<Equipo> &equipos)
{
    equipos.push_back({nombre, jugadores, 0});
}

void registrar_puntaje(string nombre, int puntos, vector<Equipo> &equipos)
{
    for (auto &equipo : equipos)
    {
        if (equipo.nombre == nombre)
        {
            equipo.puntaje_total += puntos;
            break;
        }
    }
}

void ordenar_equipos(vector<Equipo> &equipos)
{
    sort(equipos.begin(), equipos.end(), [](const Equipo &a, const Equipo &b)
         { return a.puntaje_total > b.puntaje_total; });
}

void mostrar_tabla_posiciones(vector<Equipo> &equipos)
{
    ordenar_equipos(equipos);
    cout << "Tabla de posiciones: " << endl;
    for (const Equipo &equipo : equipos)
    {
        cout << "Equipo: " << equipo.nombre << ", Puntaje: " << equipo.puntaje_total << endl;
    }
}

void buscar_equipo(string nombre, vector<Equipo> &equipos)
{
    bool encontrado = false;
    for (auto &equipo : equipos)
    {
        if (equipo.nombre == nombre)
        {
            cout << "Equipo: " << equipo.nombre << ", Puntaje: " << equipo.puntaje_total << endl;
            encontrado = true;
            break;
        }
    }
    if (!encontrado)
    {
        cout << "Equipo no encontrado." << endl;
    }
}

void equipo_mayor_puntaje(vector<Equipo> &equipos)
{
    if (equipos.empty())
    {
        cout << "No hay equipos registrados." << endl;
    }
    else
    {
        ordenar_equipos(equipos);
        cout << "Equipo con mayor puntaje: " << equipos[0].nombre << ", Puntaje: " << equipos[0].puntaje_total << endl;
    }
}

int main()
{
    int opcion= 0;
    vector<Equipo> equipos;

    registrar_equipo("AllBoys", {"Jonathan Ferrari", "Maximo Coronel"}, equipos);
    registrar_equipo("BocaJuniors", {"Sergio Romero", "Edinson Cavani"}, equipos);
    registrar_equipo("RiverPlate", {"Franco Armani", "Pablo Solari"}, equipos);

    while(opcion != 5) {
        cout << "Ingrese la opcion deseada:" << endl;
        cout << "1) Registrar equipo" << endl;
        cout << "2) Registrar datos del partido" << endl;
        cout << "3) Mostrar informacion especifica" << endl;
        cout << "4) Tabla de posiciones" << endl;
        cout << "5) Salir" << endl;
        cin >> opcion;

        switch(opcion) {
            case 1:
                registrar_equipo(nombre, jugadores,);
                break;
            case 2:
                registrar_puntaje(nombre, puntos, equipos);
                break;
            case 3:
                buscar_equipo(nombre, equipos);
                break;
            case 4:
                mostrar_tabla_posiciones(equipos);
                break;
            case 5:
                cout << "Saliendo del sistema" << endl;
                break;
            default:
                cout << "Opcion no valida." << endl;
        }
}
}