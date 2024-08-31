package banco;

import java.util.*;

public class Banco{
  private ArrayList<String> filaPreferencial,filaComum;
  private int ultimoPreferencial,ultimoComum,chamadasPreferenciais;

  public Banco(){
    filaPreferencial = new ArrayList<String>();
    filaComum = new ArrayList<String>();
    ultimoPreferencial = 0;
    ultimoComum = 0;
    chamadasPreferenciais = 0;  
  }

  public String retirarFicha(int tipo){
    if (tipo == 1) { // Preferencial
      ultimoPreferencial++;
      String ficha = "P-" + ultimoPreferencial;
      filaPreferencial.add(ficha);
      return "\nFicha preferencial retirada: " + ficha;
    } else if (tipo == 2) { // Comum
      ultimoComum++;
      String ficha = "C-" + ultimoComum;
      filaComum.add(ficha);
      return "\nFicha comum retirada: " + ficha;
    } else {
      return "Tipo de ficha inválido! Tente novamente.";
    }
  }

  /* Testar com o switch
  public String retirarFicha(int tipo){
	    switch (tipo){
	        case 1: // preferencial
	            ultimoPreferencial++;
                String ficha = "P-" + ultimoPreferencial;
                filaPreferencial.add(ficha);
                return "\nFicha preferencial retirada: " + ficha;
                break;
            case 2: // comum
                ultimoPreferencial++;
                String ficha = "P-" + ultimoPreferencial;
                filaPreferencial.add(ficha);
                return "\nFicha preferencial retirada: " + ficha;
                break;
            default:
                return "Tipo de ficha inválido! Tente novamente.";
                break;
	    }
  }
  */

  public String chamarProximo(){
    if (filaPreferencial.isEmpty() && filaComum.isEmpty()) {
      return "Nenhuma ficha para chamar.";
  }
    String proximaFicha = null;
  if ((chamadasPreferenciais < 2 || filaComum.isEmpty()) && !filaPreferencial.isEmpty()) {
          proximaFicha = filaPreferencial.remove(0);
          chamadasPreferenciais++;
      } else if (!filaComum.isEmpty()) {
          proximaFicha = filaComum.remove(0);
          chamadasPreferenciais = 0;
      }

      return "Próxima ficha chamada: " + proximaFicha;
  }

  public String proximaFicha() {
      if (!filaPreferencial.isEmpty() && (chamadasPreferenciais < 2 || filaComum.isEmpty())) {
          return "Próxima ficha será preferencial: " + filaPreferencial.get(0);
      } else if (!filaComum.isEmpty()) {
          return "Próxima ficha será comum: " + filaComum.get(0);
      } else {
          return "Nenhuma ficha disponível para ser chamada.";
      }
  }

}
