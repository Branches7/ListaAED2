
class Calculadora{
  double num1;
  double num2;
  char simbol;
  double resultado;

  public Calculadora(){ //construtor
    this.num1 = num1;
    this.num2 = num2;
    this.simbol = simbol;
  }

  public void Operacao(double num1, double num2, char simbol){ // set

    this.num1 = num1;
    this.num2 = num2;
    this.simbol = simbol;

    if (simbol == '+'){
      resultado = num1 + num2;
    }
    else if (simbol == '-'){
      resultado = num1 - num2;
    }
    else if(simbol == '*'){
      resultado = num1 * num2;
    }
    else if(simbol == '/'){
      try{
        resultado = num1 / num2;
      }
      catch(Exception e){
        System.out.println("Não é possível dividir por zero");
      }
    }
  }

  public double Result(){ //get
    return resultado;
  }
}