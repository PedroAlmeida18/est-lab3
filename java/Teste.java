public class Teste {
    public static void main(String[] args) {
         ListaLigada lista = new ListaLigada();
        lista.insert(1);
        lista.insert(4);
        lista.insert(5);
        lista.insert(7);
        System.out.println( lista.search(4));
       System.out.println(lista.search(1));
       System.out.println(lista.search(5));
        System.out.println(lista.search(7));
        System.out.println(lista.search(17));
        System.out.println(lista.maximum());
        System.out.println(lista.minimum());
        System.out.println(lista.prodessor(1));
        System.out.println(lista.prodessor(4));
        System.out.println(lista.prodessor(5));
        System.out.println(lista.prodessor(7));
        System.out.println(lista.sucessor(1));
        System.out.println(lista.sucessor(4));
        System.out.println(lista.sucessor(5));
        System.out.println(lista.sucessor(7));
        lista.delete(4);
        System.out.println(lista.search(4)) ;
        lista.delete(1);
        System.out.println(lista.search(1)) ;
       
        System.out.println(lista.search(5)) ;
        
        System.out.println(lista.search(7)) ;
       
       
       
       
       
        
    
        
        
    }
        
    }

    
    

    
