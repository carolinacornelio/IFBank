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
   switch (tipo){
	case 1: // preferencial
	    ultimoPreferencial++;
	    String fichaP = "P-" + ultimoPreferencial;
	    filaPreferencial.add(fichaP);
	    return "\nFicha preferencial retirada: " + fichaP;
	case 2: // comum
	    ultimoComum++;
	    String fichaC = "C-" + ultimoComum;
	    filaComum.add(fichaC);
            return "\nFicha comum retirada: " + fichaC;
	default:
	    return "Tipo de ficha inválido! Tente novamente.";
    }
}

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
}
