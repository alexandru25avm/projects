function out = elemente_putere(X_flat,m)

A = []; 
for i = 1:m
    L = combinatii(X_flat,i);% apelam functia combinatii pentru a realiza toate combinatiile posibile, L fiind returnat ca si matrice
    %L=combntns(X_flat,i);
    L_dim = size(L);%aflam dimensiunea functiei L pentru fiecare i
    if (m-i+1 == 1)%conditia de oprire a functiei for dupa k
        
        lim = 1;
    else
        lim = L_dim(2);%luam dimensiunea coloanei matricei L
    end
    for j = 1:L_dim(1) %j merge pana la numarul de linii din L
        for k = 1:lim   %k merge pana la numarul de coloane din L
            aux = L(j,:);%luam fiecare linie j din matricea L
            aux(k) = aux(k).^(m-i+1); %ridicam fiecare element din linie,pe rand, la urmatoarea putere mai mica ca m 
            A = [ A prod(aux) ];%apoi prin functia prod facem produsul intregii linii si il memoram in matricea A
        end
    end
end
out = A;%returnam toata matricea A
end

