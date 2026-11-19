
void main() {
    double soma = 0;
    int quantidade = 0;
    double temp = Double.parseDouble(IO.readln("Digite a temperatura: (999 quando acabar)"));
     IO.println("valor adicionado " + temp);
  ;
while(temp != 999){ 
    soma = soma + temp;
    quantidade++; 
    temp = Double.parseDouble(IO.readln("Digite a temperatura: (999 quando acabar)"));
   IO.println("valor adicionado " + temp);
     
}
IO.println("Acabou" + " um total de " + quantidade + " feitas");
IO.println("A soma das temperaturas é igual a: " + soma);
soma = (soma/quantidade);
    
if (soma > 28)
    IO.println("Temperatura alta:Ligar ventilacao ");
else
    if (soma >= 18)
    IO.println("Temperatura ideal");
else 
    IO.println("Temperatura baixa: Ligar aquecedor");
    }
