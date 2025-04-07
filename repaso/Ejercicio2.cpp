#include <iostream>
using namespace std;
#include <vector>
#include <string>

struct FechaVencimiento{
    int dia;
    int mes;
    int anio;
};


struct Producto{

    string nombre;
    int codigo;
    string marca;
    float precio;
    string vencimiento;
    FechaVencimiento fechav;
};


void CargarProductos(Producto Matriz[3][4]){
    for(int i=0;i<3;i++){//fila
        for(int y=0;y<4;y++){//columna
            cout<<"Agregar productos"<<endl;
            cout<<"Ingresar nombre del producto"<<endl;
            cin>>Matriz[i][y].nombre;
            cout<<"Ingresar el codigo"<<endl;
            cin>>Matriz[i][y].codigo;
            cout<<"Ingresar la marca"<<endl;
            cin>>Matriz[i][y].marca;
            cout<<"Ingresar el precio"<<endl;
            cin>>Matriz[i][y].precio;
            cout<<"Ingresar si tiene vencimiento (SI/NO- MAYUSCULAS)"<<endl;
            cin>>Matriz[i][y].vencimiento;

                if(Matriz[i][y].vencimiento=="SI"){
                cout<<"Ingresar dia de vencimiento"<<endl;
                cin>>Matriz[i][y].fechav.dia;
                cout<<"Ingresar mes de vencimiento"<<endl;
                cin>>Matriz[i][y].fechav.mes;
                cout<<"Ingresar anio de vencimiento"<<endl;
                cin>>Matriz[i][y].fechav.anio;
                
            }
                else{
                Matriz[i][y].fechav.dia=0;
                Matriz[i][y].fechav.mes=0;
                Matriz[i][y].fechav.anio=0;
                
            }

        }
    }

}
void Mostrar(Producto Matriz[3][4]){
    cout<<"----FILA , COLUMNA 3----";
    cout<<Matriz[2][3].nombre<<endl;
}

int ColumnaPrecioMayor(Producto Matriz [3][4]){
    int totalColumna=0;
    int mayorPrecio=0;
    int columnaMayor=0;
    for(int i=0;i<3;i++){//fila
        for(int y=0;y<4;y++){//columna
            totalColumna+=Matriz[i][y].precio;
        
        
        if(totalColumna>mayorPrecio){
            mayorPrecio=totalColumna;
            columnaMayor=y;
        }
            totalColumna=0;

        }
    }return columnaMayor+1;
}

void Promedio(Producto Matriz[3][4]){
    float suma = 0;
    float promedio;
    int fila = 3;
    int columna = 4;

    for(int i=0;i<3;i++){//fila
        for(int y=0;y<4;y++){
            suma += Matriz[i][y].precio;

            promedio = suma / (fila * columna);
        }
    }
    cout << "El promedio es: "<<promedio<<endl;

}

int Productosvencidos(Producto Matriz [3][4]){
    int contador=0;
    for(int i=0;i<3;i++){//fila
        for(int y=0;y<4;y++){//columna
          if(Matriz[i][y].vencimiento == "SI"){
            contador++;
          }
        }
    }
    return contador;
} 

int main(){
    Producto Matriz[3][4];
    CargarProductos(Matriz);
    Mostrar(Matriz);
    cout<<"------------"<<endl<<"Columna:"<<ColumnaPrecioMayor(Matriz)<<endl;
    Promedio(Matriz);
    Productosvencidos(Matriz);
    cout<<"Hay "<<Productosvencidos(Matriz)<<" productos vencidos"<<endl;
}