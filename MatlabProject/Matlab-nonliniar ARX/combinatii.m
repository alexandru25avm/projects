function [ out ] = combinatii(A,m)
%combinatii Summary of this function goes here
%   Functia care genereaza combinatiile de length(A) luate cate m elemente.
%   A - vector intrare,
%   m - numarul de elemente de combinare
%   out - matricea de combinari(lengthA),m)xm
%         fiecare linie reprezinta un alt set de indecsi
k = 1; %stiva
st = zeros(1,m);
as = true;  % am solutie
ev = false; % este valida
M = [];     % matricea finala de combinatii generate
%backtracking
    while ( k > 0) %nivelul stivei>0
        as = true;
        ev = false;
        while ( (as == true) && (( as && ev ) == false) ) 
            %Cautam daca avem un succesor si daca este valid ( o valoare pentru o solutie posibila )
            %Succesorul este de fapt o index posibil al unei linii
            if ( st(k) < length(A) )
               st(k) = st(k)+1;
               as = true;
            else
               as = false;
            end
            %Verificam validitatea posibilului succesor
            %Adica trebuie sa fie diferit de indecsii anterior ( fiind in
            %ordine putem presupune ca trebuie sa fie mai mare decat toate
            %valorile anterioare)
            if (as == true)
               ev = true;
               for i=1:k-1
                   if ( st(i)>=st(k) )
                       ev = false;
                   end
               end
            end
        end
        if ( as == true )
            %In cazul in care nivelul stivei a ajuns la lungimea m, punem
            %solutia in matricea finala
            if ( k == m )
                L = [];
                for i=1:k 
                    L(i) = A(st(i));
                end
                M = [ M; L];
            else
                k = k+1;
                st(k) = 0;
            end
        else
            k = k-1;
        end
    end
    out = M;
end

