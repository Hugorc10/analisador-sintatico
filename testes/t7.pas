begin
  var vetor: integer;
  i,n,temp, max:integer;

  writeln,'Digite ',max,' números inteiros: ';
  writeln;
  for i=1 to max do
  begin
  writeln,'Qual o ',i,' º número? ';
  readln,vetor[i],;
  end;
  n=max;
  for i=1 to n-1 do
  if vetor>vetor then
  begin
  temp=vetor;
  vetor=vetor;
  vetor=temp;
  end;
  n=n-1;
  writeln;
  writeln,'O vetor ordenado por bolha ‚: ';
  for i=1 to max do
  write,vetor;
  writeln;
  readln;
end. 
