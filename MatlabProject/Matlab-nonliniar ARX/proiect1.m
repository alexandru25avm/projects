clc
clear all
close all

load('proj_fit_20');% incarcam datele primite si initializam variabilele cu care vom lucra
x1=id.X{1};
x2=id.X{2};
y=id.Y;
m=13;%dupa mai multe incercari am ajuns la concluzia ca eroarea cea mai mica de validare ne da pentru gradul 13
x3=[];% in x3 si x4 vom retine valorile vectorilor x1 si x2 transformati in linie cu 1681 de elemente fiecare
x4=[];
psi=[];
figure 
mesh(x1,x2,y) %plotarea initiala a datelor de intrate
i=1;
while i<=length(x1) % folosim o bucla de lungimea lui x1 adica de 41 de elemnte, si construim in x3 un vector coloana
                     %in care coloanele lui x1 se repeta de 41 de ori una
                     %sub cealalta aceasta reprezentand o linie din
                     %matricea formata din x1 si x2
                     
    x3=[x3,x1];
    i=i+1;
end

i=1;
while i<=length(x2)
    j=1;
    while j<=length(x2)
        x4=[x4,x2(i)]; %construim in un vector coloana de 1681 de elemente in care fiecare element din x2 se va repeta
                        % de 41 de ori acesta reprezentant indicele liniei
                        % a matricei formate din x1 si x2
                                                    
        j=j+1;
    end
    i=i+1;
end
X_flat=[x4;x3]; % construim vectorul coloana alcatuit din 2 coloane a cate 1681 de elemente fiecare ficare format din x1 si x2
                      
Y_flat=reshape(y,1,[]); % construim vectorul coloana a iesirilor care initial a fost o matrice de 41x41 ,astfel acesta
                        % v-a deveni un vector coloana de 1681 de elemente

 i=1;

 psi=polinom(X_flat,m,x3);
 Y_flat=Y_flat';% intoarcem Y_flat
 psi=psi';% intoarcem sigma
 teta=psi\Y_flat; % aflam tenta folosind formula prezentata in cursul 3
 Y_out=psi*teta; % apoi aflam polinomul de aproximare prin inmultirea a sigma si teta
 
 aux=length(y);
 Y_out=vec2mat(Y_out,aux);  %pentru a putea realiza operatia de scadere pentru a afla eroarea trebuie sa transformam
 % Y_out inapoi in matrice astfel luam lungimea matricei y si il schimbam
 % pe Y_out

 e=y'-Y_out; %calculam diferenta dintre polinomul de intrare si polinomul de iesire
 MSE=1/(length(y)^2).*sum(sum(e.^2)); % aflam eroarea dupa formula data la laborator

 figure 
 mesh(x1,x2,y) 
 hold on

  Y_out=Y_out.';
 mesh(x1,x2,Y_out,'edgecolor','r');% reprezentam grafic polinomul de aproximare peste imaginea 
 title(['MSE identificare= ',num2str(MSE)]);


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

x1=val.X{1}; % dupa ce am aflat polinomul de aproximare pentru identificare trebuie sa il aflam si pentru datele de validare
x2=val.X{2};% in continuare vom repeta pasii amintiti mai sus
y=val.Y;

x3=[];
x4=[];
psi_validare=[];

i=1;
while i<=length(x1)
    x3=[x3,x2];
    i=i+1;
end

i=1;
while i<=length(x2)
    j=1;
    while j<=length(x2)
        x4=[x4,x2(i)];
        j=j+1;
    end
    i=i+1;
end
X_flat=[x4;x3];
Y_flat=reshape(y,1,[]);

i=1;
psi_validare1=[];
while i<=m
    psi_validare1=[psi_validare1;X_flat(1,:).^i;X_flat(2,:).^i];
    i=i+1;
end

i=1;
j=1;
aux=0;
psi_validare2=[];
while i<=m
    while j<=m
        aux=i+j;
        if aux <= m
            psi_validare2=[psi_validare2;X_flat(1,:).^i.*X_flat(2,:).^j]; 
        end
        j=j+1;
    end
    i=i+1;
    j=1;
end

 c=ones(1,length(x3));
 psi_validare=[c;psi_validare1;psi_validare2];

 psi_validare=psi_validare';

 Y_out_validare=psi_validare*teta;% pastram teta realizat pentru datele de identificare 
 aux=length(y);
 Y_out_validare=vec2mat(Y_out_validare,aux); 

 e=y'-Y_out_validare;
 MSE=1/(length(y)^2).*sum(sum(e.^2));

 figure 
 mesh(x1,x2,y) 
 hold on

 Y_out_validare=Y_out_validare.';
 mesh(x1,x2,Y_out_validare,'edgecolor','r');
 title(['MSE validare= ',num2str(MSE)]);
