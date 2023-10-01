public class Soldado {
    String nombre;
    int vida;
    int fila;
    char columna;
    public Soldado(String nombre, int vida, int fila, char columna){
        this.nombre=nombre;
        this.vida=vida;
        this.fila=fila;
        this.columna=columna;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setVida(int vida){
        this.vida=vida;
    }
    public int getVida(){
        return this.vida;
    }
    public void setFila(int fila){
        this.fila=fila;
    }
    public int getFila(){
        return this.fila;
    }
    public void setColumna(char columna){
        this.columna=columna;
    }
    public char getColumna(){
        return this.columna;
    }
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+"\nVida: "+this.vida+"\nFila: "+this.fila+"\nColumna: "+this.columna;
    }
}