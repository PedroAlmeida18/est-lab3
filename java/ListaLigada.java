import java.security.cert.CertPathValidatorResult;

public class ListaLigada implements EstruturaDeDados{
    private No inicio;

    public void removeInicio (){
        if (inicio != null)
            inicio = inicio.getProximo();
    }

    public void removeFim (){
        if (inicio == null){
            return;
        }
        if (inicio.getProximo() == null){
            inicio = null;
        }
        removeFim(inicio);
    }

    public void removeFim (No n){
        No proximo = n.getProximo();
        if (proximo.getProximo() == null){
            n.setProximo(null);
            return;
        } else{
            removeFim(proximo);
        }
    }

    public void insereInicio (int valor){
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        No n = new No(valor);
        n.setProximo(inicio);
        inicio = n;

    }

    public void insereFim (int valor){
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        insere(inicio, valor);
    }

    public boolean procura (int valor){
        if (inicio == null){
            return false;
        } else {
            return procura(inicio, valor);
        }
    }

    public boolean procura (No n, int valor){
        if (n.getValor() == valor){
            return true;
        } else if (n.getProximo() == null){
            return false;
        } else {
            return procura(n.getProximo(), valor);
        }
    }
    public void insere (No n, int valor){
        if (n.getProximo() == null){
            No novo = new No(valor);
            n.setProximo(novo);
        } else {
            insere(n.getProximo(), valor);
        }
    }

    public void remover(int valor){
        if (inicio == null){
            return;
        }
        if (inicio.getValor() == valor){
            inicio = inicio.getProximo();
            return;
        }
        remover(inicio, valor);
    }

    public void remover(No n, int valor){
        No proximo = n.getProximo();
        if (proximo == null){
            return;
        }
        if (proximo.getValor() == valor){
            n.setProximo(proximo.getProximo());
        } else{
            remover(proximo, valor);
        }
    }

    public static void main(String[] args) {
      
    }

    @Override
    public boolean insert(int chave) {
        if (inicio == null){
            inicio = new No (chave);
            inicio.setProximo(null);
            return true ;
        }
        else { 
          No no = new No(chave);
          no.setProximo(inicio);
          inicio= no;
          return false;
            
        }
        
    }

    @Override
    public boolean delete(int chave) {
        if (inicio.getValor()== chave ) {
            inicio = null;
            return true ;
        }
        else {
            inicio.setProximo(null);
            return false;

        }

        
    }

    @Override
    public boolean search (int chave ) {
         if (inicio.getValor()==chave) { 
             return true;
         }
         else {
            
            return  ProcuraNO(inicio, chave);

         }
         } 

         
    

    @Override
    public int minimum() {
        if () {
            
        }
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        if (inicio.getValor() == chave ) {
            return inicio.getProximo().getValor();
            
        }
        else {
            return anterior2(chave,inicio);
        }
    }

    @Override
    public int prodessor(int chave) {
        if (inicio.getValor()== chave ) {
            return inicio.getProximo().getValor();
            
        }
        else {
            return inicio.getProximo().getProximo().getValor();
        }
        
    }
    public boolean ProcuraNO( No no, int chave){
        if (no.getValor()== chave ) {
            return true ;
        }
        else if (no.getProximo()== null){
            return false;
        
        }
        else {
            return ProcuraNO(no, chave);
        }
        
    } 
    public int anterior2 (  int chave, No no ){
        if (no.getValor() == chave ) {
            return no.getProximo().getValor();
        }
        else if (no.getProximo()== null){
            return 0;
        
        }
        else {
            return anterior2(chave, no);
        }

    }
    }