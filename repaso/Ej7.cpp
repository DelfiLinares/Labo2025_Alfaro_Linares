#include <iostream>
#include <vector>
#include <string>
using namespace std;

//24 carreras, 10 equipos, 2 pilotos
struct Vuelta_rapida {
    string sino;
    int numero_vuelta;
    int tiempo;

  };
  struct Equipo_t {
    string nombre;
    int puntos;
 };

struct Piloto_t{
    string nombre;
    int numauto;
    string equipo;
    int posinicio;
    int posfinal;
    int puntos;
    Vuelta_rapida vueltita;
    

};


  void cargar_datos_carrera(){

  };

  void CargaPiloto(vector<Piloto_t>&pilotos){
    for(int i=0;i<2;i++){//20 pilotos
    Piloto_t pilotonto;
    cout<<"Ingresar nombre del piloto"<<endl;
    cin>>pilotonto.nombre;
    cout<<"Ingresar numero de auto"<<endl;
    cin>>pilotonto.numauto;
    cout<<"Ingresar posición inicial"<<endl;
    cin>>pilotonto.posinicio;
    cout<<"Ingresar posicion final"<<endl;
    cin>>pilotonto.posfinal;
    cout<<"Ingresar cantidad de puntos"<<endl;
    cin>>pilotonto.puntos;
    cout<<"Ingresar si realizó la vuelta rápida (SI/NO)"<<endl;
    cin>>pilotonto.vueltita.sino;
    if(pilotonto.vueltita.sino == "SI"){
        cout<<"Ingresar numero de vuelta"<<endl;
        cin>>pilotonto.vueltita.numero_vuelta;
        cout<<"Ingresar tiempo";
        cin>>pilotonto.vueltita.tiempo;
        pilotonto.puntos+=1;
        cout<<"PUNTAJE CAMBIADO; el nuevo puntaje es:"<<pilotonto.puntos<<endl;
    }
    if(pilotonto.vueltita.sino=="NO"){
        pilotonto.vueltita.numero_vuelta=0;
        pilotonto.vueltita.tiempo=0;
        cout<<"No realizó la vuelta rápida";
    }
    cout<<"Ingresar nombre del equipo"<<endl;
    cin>>pilotonto.equipo;
 
    pilotos.push_back(pilotonto);
    }

    }
    int PuntosPorEquipo(vector<Piloto_t>pilotos){
        int puntossumados=0;
        string team;
        cout<<"Ingrese nombre del equipo"<<endl;
        cin>>team;
        for(int i=0; i<pilotos.size();i++){
            if(pilotos[i].equipo==team){
                puntossumados+=pilotos[i].puntos;
            }
        }return puntossumados;
    } 

    void CargarEquipo(vector<Equipo_t>&equipos,vector<Piloto_t>pilotos){
        for(int i=0;i<10;i++){
            Equipo_t equipazo;
            cout<<"Ingresar nombre del equipo"<<endl;
            cin>>equipazo.nombre;
            equipazo.puntos=PuntosPorEquipo(pilotos);
            equipos.push_back(equipazo);
        }
    }
   

int main(){
    vector<Equipo_t> equipos;
    vector<Piloto_t> pilotos;
    CargaPiloto(pilotos);
    CargarEquipo(equipos,pilotos);
   // ordenar_tabla_equipos();
    //mostrar_tabla_equipos();
 }