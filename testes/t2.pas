begin
	i: int;
	num: int;
	total int;
	final nome: String;
	writeln,'Insira o seu nome: ';
	readln, nome;
	writeln,'Seja bem vindo '+nome+'!';
	writeln,'Informe dez numeros: ';
	i = 0;
	while (i < 10) begin
    writeln, 'Insira o '+i+' numero: ';
    readln,num;
    total = total + num;
    i = i + 1;
	end;
	writeln,'A soma dos números informados é: '+total;
end.
