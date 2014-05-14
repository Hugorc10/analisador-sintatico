begin
  /*******************Declaração de variavis*********************/
  i, n1, n2, total: int;
  i = 0;
  nome, op: String;
  resp: boolean;
  {----------- Programa multiplicação -------------------------}
  writeln,'Insira o seu nome: ';
  readln,nome;
  writeln,'Seja bem vindo '+nome+'!';
  writeln,'Multiplicação';
  while(resp == true) begin
    writeln,'Insira o primeiro número: ';
    readln,n1;
    writeln,'Insira o segundo número: ';
    readln,n2;
    total = n1 * n2;
    writeln,'O total é: '+total;
    writeln,'Deseja fazer nova multiplicação? s/n';
    readln,op;
    if (op == 's') then
        resp = true;
      else 
        resp = false;  
    end;
  end;
end.
