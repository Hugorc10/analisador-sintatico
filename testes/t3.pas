begin 
  resp : boolean;
  soma : int;
  n1, n2, total: int;
  nome, op: string;
  
  while (resp == true) begin
    writeln,'Insira o primeiro número: ';
    readln,n1;
    writeln,'Insira o segundo número: ';
    readln,n2;
    total = n1 + n2;
    writeln,'O total é: '+total;
    writeln,'Deseja efetuar outra soma? s/n';
    readln, op;
    if (op == 's') then 
        resp = true;
      else 
        resp = false;
    end;  
  end;
end.
