
package ruleta;
import java.util.*;
import java.lang.*;
public class Ruleta {
        
   
    public static void main(String[] args) {
       
        int[] voluno={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        
        int[] voldos={19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
            
        int[] pares = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
                
        int[] impares= {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
        
        int[] negros= {2, 4, 6, 8, 11, 10, 13, 15, 17, 20, 22, 24, 26, 29, 28, 31, 33, 35};
        
        int[] rojo= {1,  3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
        
        int[] parteUno={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,45,46,48,49,47,42,41,40};
        
        int[] parteDos={13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,45,46,48,49,47,42,41,40};
        
        int[] parteTres={25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36,45,46,48,49,47,42,41,40};
        
        int cero = 0;
        
        int ROJO=0;
        int NEGRO=0;
        int PAR=0;
        int IMPAR=0;
        int PARTEUNO=0;
        int PARTEDOS=0;
        int PARTETRES=0;
        int VOLUNO=0;
        int VOLDOS=0;
        
                
        
        
        Scanner entrada= new Scanner(System.in);

        
        int i = 0;
              
        System.out.println("Introduce primer numero");        
        
        
        for(int h=45;h<=400;h++){
            
        int numeroaleatorio= (int)(Math.random() * 36);
            System.out.println("Escribe El Siguiente");
        int numero1=entrada.nextInt();
        for(int y=0;y<=17;++y){
            
            
            if(numero1==pares[y]){
                                         
                for(int x=0;x<=17;x++){
                    
                    
                    if (numero1==negros[x]){
                        
                        
                        for(int z=0;z<=17;z++){
                            
                            
                            if (numero1==voluno[z]){
                                
                                for(int c=0;c<=17;++c){
                                
                                    if(numero1==parteUno[c]){
                                System.out.println("Primer numero: " + numero1 + " Es par Negro del 1-18 de la Primera Parte");
                                IMPAR++;
                                ROJO++;
                                VOLDOS++;
                                PARTEDOS++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                                    
                                
                                
                                break;
                                }
                                    else if(numero1==parteDos[c]){
                                        System.out.println("Primer numero: " + numero1 + "Es par negro del 1-18 de la Segunda parte");
                                        
                                IMPAR++;
                                ROJO++;
                                VOLDOS++;
                                PARTEUNO++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                        break;
                                    }
                                }
                            }
                            else if (numero1==voldos[z]){
                                
                                for(int l=0;l<=17;++l){
                                
                                    if(numero1==parteDos[l]){
                                System.out.println("Primer numero: " + numero1 + " Es par Negro del 19-36 de la Segunda Parte");
                                IMPAR++;
                                ROJO++;
                                VOLUNO++;
                                PARTEUNO++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                }
                                    else if(numero1==parteTres[l]){
                                        System.out.println("Primer numero: " + numero1 + "Es par negro del 19-36 de la TERCERA parte");
                                IMPAR++;
                                ROJO++;
                                VOLUNO++;
                                PARTEUNO++;
                                PARTEDOS++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                    }
                                }
                            }
                    }
                    }
                    else if (numero1==rojo[x]){
                        
                        
                        for(int z=0;z<=17;z++){
                            
                            
                            if (numero1==voluno[z]){
                                
                                for(int c=0;c<=17;++c){
                                
                                    if(numero1==parteUno[c]){
                                System.out.println("Primer numero: " + numero1 + " Es par Rojo del 1-18 de la Primera Parte");
                                IMPAR++;
                                NEGRO++;
                                VOLDOS++;
                                PARTEDOS++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                }
                                    else if(numero1==parteDos[c]){
                                        System.out.println("Primer numero: " + numero1 + "Es par Rojo del 1-18 de la Segunda parte");
                                IMPAR++;
                                NEGRO++;
                                VOLDOS++;
                                PARTEUNO++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                    }
                                }
                            }
                            else if (numero1==voldos[z]){
                                
                                for(int l=0;l<=17;++l){
                                
                                    if(numero1==parteDos[l]){
                                System.out.println("Primer numero: " + numero1 + " Es par Rojo del 19-36 de la Segunda Parte");
                                IMPAR++;
                                NEGRO++;
                                VOLUNO++;
                                PARTEUNO++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                }
                                    else if(numero1==parteTres[l]){
                                        System.out.println("Primer numero: " + numero1 + "Es par Rojo del 19-36 de la Tercera parte");
                                IMPAR++;
                                NEGRO++;
                                VOLUNO++;
                                PARTEUNO++;
                                PARTEDOS++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                    }
                                }
                            }
                    }
                    }
                        
                        
                        
                        
                    }
                    
                }
            //COMIENZO DE IMPARES
            else if(numero1==impares[y]){
                                         
                for(int x=0;x<=17;++x){
                    
                    
                    if (numero1==negros[x]){
                        
                        
                        for(int z=0;z<=17;z++){
                            
                            
                            if (numero1==voluno[z]){
                                
                                for(int c=0;c<=17;++c){
                                
                                    if(numero1==parteUno[c]){
                                System.out.println("Primer numero: " + numero1 + " Es impar Negro del 1-18 de la Primera Parte");
                                PAR++;
                                ROJO++;
                                VOLDOS++;
                                PARTEDOS++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                }
                                    else if(numero1==parteDos[c]){
                                        System.out.println("Primer numero: " + numero1 + "Es impar negro del 1-18 de la Segunda parte");
                                PAR++;
                                ROJO++;
                                VOLDOS++;
                                PARTEUNO++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                    }
                                }
                            }
                            else if (numero1==voldos[z]){
                                
                                for(int l=0;l<=17;++l){
                                
                                    if(numero1==parteDos[l]){
                                System.out.println("Primer numero: " + numero1 + " Es impar Negro del 19-36 de la Segunda Parte");
                                PAR++;
                                ROJO++;
                                VOLUNO++;
                                PARTEUNO++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                }
                                    else if(numero1==parteTres[l]){
                                        System.out.println("Primer numero: " + numero1 + "Es impar negro del 19-36 de la Tercera parte");
                                PAR++;
                                ROJO++;
                                VOLUNO++;
                                PARTEUNO++;
                                PARTEDOS++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                    }
                                }
                            }
                    }
                    }
                
                    else if (numero1==rojo[x]){
                        
                        
                        for(int z=0;z<=17;z++){
                            
                            
                            if (numero1==voluno[z]){
                                
                                for(int c=0;c<=17;++c){
                                
                                    if(numero1==parteUno[c]){
                                System.out.println("Primer numero: " + numero1 + " Es impar Rojo del 1-18 de la Primera Parte");
                                PAR++;
                                NEGRO++;
                                VOLDOS++;
                                PARTEDOS++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                }
                                    else if(numero1==parteDos[c]){
                                        System.out.println("Primer numero: " + numero1 + "Es impar Rojo del 1-18 de la Segunda parte");
                                PAR++;
                                NEGRO++;
                                VOLDOS++;
                                PARTEUNO++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                    }
                                }
                            }
                            else if (numero1==voldos[z]){
                                
                                for(int l=0;l<=17;++l){
                                
                                    if(numero1==parteDos[l]){
                                System.out.println("Primer numero: " + numero1 + " Es impar Rojo del 19-36 de la Segunda Parte");
                                PAR++;
                                NEGRO++;
                                VOLUNO++;
                                PARTEUNO++;
                                PARTETRES++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                }
                                    else if(numero1==parteTres[l]){
                                        System.out.println("Primer numero: " + numero1 + "Es impar Rojo del 19-36 de la Tercera parte");
                                PAR++;
                                NEGRO++;
                                VOLUNO++;
                                PARTEUNO++;
                                PARTEDOS++;
                                 System.out.println("ROJO: "+ROJO);
            System.out.println("NEGRO: "+NEGRO);
            System.out.println("Par: "+ PAR);
            System.out.println("impar:" + IMPAR);
            System.out.println("voluno: " + VOLUNO);
            System.out.println("voldos: " + VOLDOS);
            System.out.println("Parte uno: " + PARTEUNO );
            System.out.println("PArte DOS: " + PARTEDOS);
            System.out.println("Parte tres: " + PARTETRES);
                                break;
                                    }
                                }
                            }
                    }
                    
            
                    }
                }
            }
           
            
        }
    }
}
   

    
}

            
        
    
    
                        
                        
 