function out = plinom(X_flat,m,x3)
i=1;
sigma1=[];
m
while i<=m
    sigma1=[sigma1;X_flat(1,:).^i;X_flat(2,:).^i]; 
    %in acest loop de tip while am ridicat la puterea maxima indicata de
    %la inceput este puterea 1 si vom lua coloana din X_flat adica coloana
    %lui x1 si o vom ridica toata la puterea 1 apoi coloana x2 ,dupa care
    %vom retine in metricea sigma valoarea coloanelor , astfel vom face
    %pentru toate coloanele pana ajungem la gradul maxim                                          
    i=i+1;
end
i=1;
j=1;
aux=0;
sigma2=[];
while i<=m
    while j<=m
        aux=i+j;
        if aux <= m
            sigma2=[sigma2;X_flat(1,:).^i.*X_flat(2,:).^j]; 
            %datorita faptului ca nu putem face combinatii de puteri maxime
            %vom face combinatii pornind de la gradul cel mai mic pana la
            %m-1 astfel vom obtine toate combinatiile posibile dintre toate
            %gradele
        end
        j=j+1;
    end
    i=i+1;
    j=1;
    aux=0;
end
c=ones(1,length(x3)); %vom crea un vector coloana de 1681 de elemente format din elementul 1
 sigma=[c;sigma1;sigma2];% constuim sigma "complet" din vectorul coloana de 1, sigma 1 care reprezinta matricea formata
 out=sigma;

end

