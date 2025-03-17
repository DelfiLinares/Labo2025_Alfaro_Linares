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
        cout<<"Ingresar aÃ±o de nacimiento"<<endl;
        cin>>datos.fecha.anio;
        cout<<"Ingresar sexo"<<endl;
        cin>>datos.sexo;
        cout<<"Ingresar salario"<<endl;
        cin>>datos.salario;
        Empleados.push_back(datos);
    }
}void EmpleadoMayorSueldo(vector<empleado>& Empleados, vector<empleado>& BajoSueldo) {
    empleado MayorSueldo = Empleados[0];
	empleado emp;
for (int i = 0; i< Empleados.size(); i++){

 	if (Empleados[i].salario<= 400000) {
            	BajoSueldo.push_back(Empleados[i]);          }

        if (Empleados[i].salario> MayorSueldo[i].salario) {
            Empleados[i]= emp;
        }
    }
}
int main(){
 vector<empleado>MayorSueldo;
 vector<empleado>Empleados;
 vector<empleado> BajoSueldo;
 CargarDatos(Empleados);
 EmpleadoMayorSueldo(Empleados);
}
