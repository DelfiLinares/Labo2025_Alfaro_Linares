#include <iostream>
#include <string>
#include <vector>
using namespace std;
struct date{
    int dia;
    int mes;
    int anio;
};
struct empleado{
    string name;
    string apellido;
    date fecha;
    char sexo;
    float salario;


};
 
void CargarDatos(vector<empleado>&Empleados){
    int respuesta;
    cout<<"Ingresar cantidad de empleados"<<endl;
    cin>>respuesta;
    for(int i=0;i<respuesta;i++){
        empleado datos;
        cout<<"Ingresar nombre"<<endl;
        cin>>datos.name;
        cout<<"Ingresar apellido"<<endl;
        cin>>datos.apellido;
        cout<<"Ingresar dia de nacimiento"<<endl;
        cin>>datos.fecha.dia;
        cout<<"Ingresar mes de nacimiento"<<endl;
        cin>>datos.fecha.mes;
        cout<<"Ingresar año de nacimiento"<<endl;
        cin>>datos.fecha.anio;
        cout<<"Ingresar sexo"<<endl;
        cin>>datos.sexo;
        cout<<"Ingresar salario"<<endl;
        cin>>datos.salario;
        Empleados.push_back(datos);
    }
}

void EmpleadoConMayorSueldo(vector<empleado>&Empleados){
vector<empleado>Menor={};

    for (int i = 0; i< Empleados.size(); i++)
    {
        empleado sal=Empleados[i];
        empleado mayorsalario;
        if (sal.salario<=400000)
        {
            Menor.push_back(sal);
        }
         

            else if(Empleados[i].salario>Empleados[i+1].salario){
                mayorsalario=Empleados[i];
                cout<<"--- MAYOR----"<<endl;
                cout<<mayorsalario.name<<endl;
                cout<<mayorsalario.apellido<<endl;
                cout<<mayorsalario.fecha.dia<<"/";
                cout<<mayorsalario.fecha.mes<<"/";
                cout<<mayorsalario.fecha.anio<<endl;
                cout<<mayorsalario.sexo<<endl;
                cout<<mayorsalario.salario<<endl;
            }
         for(int j=0;j<Menor.size()){
            cout<<Menor[j].name<<endl;
            cout<<Menor[j].apellido<<endl;
            cout<<Menor[j].fecha.dia<<"/";
            cout<<Menor[j].fecha.mes<<"/";
            cout<<Menor[j].fecha.anio<<endl;
            cout<<Menor[j].salario<<endl;
            cout<<Menor[j].sexo<<endl;
         }
    }
    
    
}

int main(){
    vector<empleado>Empleados;
 CargarDatos(Empleados);
 EmpleadoConMayorSueldo(Empleados);
}