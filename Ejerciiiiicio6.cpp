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
    int cant=0;
    string jugador;

    cout<<"Ingrese el nombre del equipo"<<endl;
    cin>>nombre;
    cout<<"Ingrese la cantidad de jugadores del equipo"<<endl;
    cin>>cant;
    for(int i=0; i<cant;i++){
        cout<<"Ingrese el nombre del jugador"<<endl;
        cin>>jugador;

        jugadores.push_back(jugador);
    }
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

void Sistema(vector<Equipo> &equipos)
{
    int opcion;

    do
    {
        cout << "1- Desea registrar los puntos obtenidos?" << endl;
        cout << "2- Desea mostrar la Tabla?" << endl;
        cout << "3- Desea buscar un equipo por su nombre?" << endl;
        cout << "4- Desea calcular el equipo con mayor puntaje?" << endl;
        cout << "5- Desea registrar el equipo?" << endl;
        cout << "0- Salir" << endl;
        cin >> opcion;

        if (opcion == 1)
        {
            string nombre;
            int puntos;
            cout << "Ingrese el nombre del equipo: ";
            cin >> nombre;
            cout << "Ingrese los puntos obtenidos: ";
            cin >> puntos;
            registrar_puntaje(nombre, puntos, equipos);
        }
        else if (opcion == 2)
        {
            mostrar_tabla_posiciones(equipos);
        }
        else if (opcion == 3)
        {
            string nombre;
            cout << "Ingrese el nombre del equipo a buscar: ";
            cin >> nombre;
            buscar_equipo(nombre, equipos);
        }
        else if (opcion == 4)
        {
            equipo_mayor_puntaje(equipos);
        }
        else if (opcion == 5)
        {
            registrar_equipo(nombre, jugadores, equipos);
        }
    } while (opcion != 0);
}




int main()
{
    vector<Equipo> equipos;

    registrar_equipo("AllBoys", {"Jonathan Ferrari", "Maximo Coronel"}, equipos);
    registrar_equipo("BocaJuniors", {"Sergio Romero", "Edinson Cavani"}, equipos);
    registrar_equipo("RiverPlate", {"Franco Armani", "Pablo Solari"}, equipos);

    Sistema(equipos);
}