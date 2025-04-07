#include <iostream>
using namespace std;
#include <vector>
#include <string>
struct Productos{
    string nombre;
    int cantidad;
    float precio;
};

struct Pedido{
    int numero;
    string nombre_cliente;
    Productos producto;
    string estado;
};

void Agregar(vector<Pedido>&Pedidito){
    Pedido pedididis;
    int num;
    cout<<"Cantidad de pedidos"<<endl;
    cin>>num;
    for(int u=0;u<num;u++){
    cout<<"-----PEDIDO----"<<endl;
    cout<<"Ingrese numero de pedido"<<endl;
    cin>>pedididis.numero;
    cout<<"Ingrese nombre del cliente"<<endl;
    cin>>pedididis.nombre_cliente;
    cout<<"Ingrese el estado del pedido"<<endl;
    cin>>pedididis.estado;
    cout<<"Ingrese el nombre del producto"<<endl;
    cin>>pedididis.producto.nombre;
    cout<<"Ingrese la cantidad del producto"<<endl;
    cin>>pedididis.producto.cantidad;
    cout<<"Ingrese el precio del producto"<<endl;
    cin>>pedididis.producto.precio;

    Pedidito.push_back(pedididis);
    }
    cout<<"--------------"<<endl;
}

void Buscar(vector<Pedido>&Pedidito){
    int numero;
    cout<<"---CANCELAR PEDIDO----"<<endl;
    cout<<"Ingresar numero de pedido"<<endl;
    cin>>numero;
    for(int i=0;i<Pedidito.size();i++){
        if(Pedidito[i].numero==numero){
            Pedidito[i].estado = "Cancelado";
            cout<<"Su pedido ha sido cancelado"<<endl;
        }
    }    
}
void PedidosenCurso(vector<Pedido>Pedidito){
    int total=0;
    int ingresito = 0;
    cout<<"------PEDIDOS EN CURSO------"<<endl;
    for(int i=0;i<Pedidito.size();i++){
        if(Pedidito[i].estado == "vigente"){
            cout<<"ESTADO:"<<Pedidito[i].estado<<endl;
            cout<<"NOMBRE CLIENTE:"<<Pedidito[i].nombre_cliente<<endl;
            cout<<"NUMERO DE CLIENTE:"<<Pedidito[i].numero<<endl;
            cout<<"NOMBRE DE PRODUCTO:"<<Pedidito[i].producto.nombre<<endl;
            total=Pedidito[i].producto.cantidad*Pedidito[i].producto.precio;
            cout<<"Total="<<total<<endl;
        }
    }
}

int main(){
vector<Pedido>Pedidito;
Agregar(Pedidito);
Buscar(Pedidito);
PedidosenCurso(Pedidito);
}