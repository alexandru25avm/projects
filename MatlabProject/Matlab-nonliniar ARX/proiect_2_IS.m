clc
close all
clear all
load('iddata-05');%incarcam datele primite

Y = id_array(:,3)';%initializam valorile lui Y din id_array
U = id_array(:,2)';%initializam valorile lui U din id_array
%valorile lui na, nb si nk alese pentru o aproximare cat mai buna
na = 1;
nb = 2;
nk = 1;
%gradul ales pentru o aproximare cat mai buna
m = 3;
lungime = length(id_array(:,1));%initializam lungimea care reprezinta timpul de simulare

figure 
plot(U);
hold on
plot(Y,'r');

L = [];
for k = 1:lungime
    y = [];
    for i = 1:na %deoarece atunci cand k este mic nu putem scadea la o valoare a lui y mai mica decat 1 am realizat o structura
        if (i>=k) 
            y = [0 y];%care daca nu poate scadea v-a completa cu 0 valoarea lui y pentru k-ul respectiv
        else
            y = [ Y(k-i) y ];%iar daca are de unde sa adauge pasul anterior atunci acesta v-a fi adaugat vectorului
        end
    end
    
    u = [];
    for i = nk:nk+nb-1
        if (i>=k)%deoarece atunci cand k este mic nu putem scadea la o valoare a lui u mai mica decat 1 am realizat o structura
            u = [0 u];%care daca nu poate scadea v-a completa cu 0 valoarea lui u pentru k-ul respectiv
        else
            u = [ U(k-i) u ] ;%iar daca are de unde sa adauge pasul anterior atunci acesta v-a fi adaugat vectorului
        end
    end
    
    if (length(u) > length(y)) % daca na si nb nu sunt egale am creat acest if pentru a completa automat valorile pentru u si y
        y = [ y ones(1,length(u)-length(y)) ];%in cazul in care unul din acestea este mai mare in scopul realizarii unei matrici
    else
        u = [ u ones(1,length(y)-length(u)) ];%patratice
    end
    
    L_flat = [u' y'];%am creat matricea L_flat care are 2 coloane u si y,acestea fiind valorile la puterea cea mai mica pentru
    L_flat_size = size(L_flat);%un respectiv k
    L_flat_size = L_flat_size(1)*L_flat_size(2);%L_flat_size l-am creat mai mult pentru verificare pentru a vedea daca algoritmul de
                                               %mai sus isi face treaba
    L_flat = reshape(L_flat,1,L_flat_size);%remodelam matricea L_flat in o matrice linie de L_flat_size coloane
    sigma=elemente_putere(L_flat,m);%apelam functia elemente_putere (modificata de la primul proiect) pentru crearea polinomului final
    L = [ L; sigma];%apoi construim matricea finala L care v-a retine toate valorile pentru toate k-urile
end

theta = L\Y';%impartim matricea L la matricea Y pentru a afla matricea theta
Yest_ID = L*theta;%dupa recalcularea matricei L aflam Y estimat prin inmultirea matricei L cu matricea theta aflata la identificare
 Yest_ID = Yest_ID(1:length(Yest_ID));
 
 Yid = id_array(:,3)';%initializam Y de validare
 Yid = Yid(1:length(Yid));
 
 timp = id_array(:,1)';%reinitializam timpul de validare
 timp = timp(1:length(timp));
 
 figure
 plot(timp,Yest_ID,'r');%plotam datele
 hold on;
 plot(timp,Yid,'--k');
 xlabel('u');
 ylabel('y');
 MSE = 1/(length(Yid)).*(sum((Yest_ID'-Yid).^2));%calculam eroarea medie patratica
 title(['MSE Predictie date identificare = ',num2str(MSE)]);
 legend('y_e_s_t_i_m_a_t','y_a_c_t_u_a_l');


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
lungime = length(val_array(:,1));%reinitializam lungimea
Y = val_array(:,3)';%reinitializam datele de validare
U = val_array(:,2)';
L = [];%reinitializam matricea L

for k = 1:lungime %aplicam aceelasi algoritm ca la etapa de identificare ,dar de aceasta data procesul de realizeaza pe datele de
    y = [];       %validare
    for i = 1:na
        if (i>=k) 
            y = [0 y];
        else
            y = [ Y(k-i) y ];
        end
    end
    
    u = [];
    for i = nk:nk+nb-1
        if (i>=k)
            u = [0 u];
        else
            u = [ U(k-i) u ] ;
        end
    end
    
    if (length(u) > length(y))
        y = [ y ones(1,length(u)-length(y)) ];
    else
        u = [ u ones(1,length(y)-length(u)) ];
    end
    
    L_flat = [u' y'];
    L_flat_size = size(L_flat);
    L_flat_size = L_flat_size(1)*L_flat_size(2);
    L_flat = reshape(L_flat,1,L_flat_size);
    sigma=elemente_putere(L_flat,m);
    L = [ L; sigma];
    
end

 Yest = L*theta;%dupa recalcularea matricei L aflam Y estimat prin inmultirea matricei L cu matricea theta aflata la identificare
 Yest = Yest(1:length(Yest));
 
 Yval = val_array(:,3)';%initializam Y de validare
 Yval = Yval(1:length(Yval));
 
 timp = val_array(:,1)';%reinitializam timpul de validare
 timp = timp(1:length(timp));
 
 figure
 plot(timp,Yest,'r');%plotam datele
 hold on;
 plot(timp,Yval,'--k');
 xlabel('u');
 ylabel('y');

 MSE = 1/(length(Yval)).*(sum((Yest'-Yval).^2));%calculam eroarea medie patratica
 title(['MSE Predictie date validare = ',num2str(MSE)]);
 legend('y_e_s_t_i_m_a_t','y_a_c_t_u_a_l');
 
 %%
%Simulare

na = 1;
nb = 2;
nk = 1;

m = 3;

L = [];
Ysimulat = zeros(1,length(val_array)); %initializam matricea coloana cu 0 de lungimea val_array adica de 501 elemente
U = val_array(:,2)';% initializam U cu datale de validare
lungime = length(val_array(:,1));%initializam lungimea cu datele de pe prima coloana a lui val_array adica timpul
for k = 1:lungime
    y = [];
    for i = 1:na         %algoritmul este similar cu cel de mai sus singura modificare este mai jos
        if (i>=k) 
            y = [0 y];
        else
            y = [ Ysimulat(k-i) y ];
        end
    end
    u = [];
    for i = nk:nk+nb-1
        if (i>=k)
            u = [0 u];
        else
            u = [ U(k-i) u ] ;
        end
    end
    
    if (length(u) > length(y))
        y = [ y ones(1,length(u)-length(y)) ];
    else
        u = [ u ones(1,length(y)-length(u)) ];
    end
    
    L_flat = [u' y'];
    L_flat_size = size(L_flat);
    L_flat_size = L_flat_size(1)*L_flat_size(2);
    L_flat = reshape(L_flat,1,L_flat_size);
    sigma=elemente_putere(L_flat,m);
    Ysimulat(k) = sigma*theta; %unde calculam fiecare polinom Yestimat(k) la un pas anterior si il salvam in matricea Yestimat
end

 Yval = val_array(:,3)';         %apoi repetam pasii anteriori si afisam datele calculate
 Yval = Yval(1:length(Yval));
 
 timp = val_array(:,1)';
 timp = timp(1:length(timp));
 
 figure
 plot(timp,Ysimulat,'r');
 hold on;
 plot(timp,Yval,'--k');
 xlabel('u');
 ylabel('y');
 MSE = 1/(length(Yval)).*(sum((Ysimulat-Yval).^2));
 title(['MSE Simulare pe datele de validare = ',num2str(MSE)]);
 legend('y-simulat','y-actual');
 
 
 
%Simulare pe identificare
hold off;

L = [];
Ysimulat = [];
Ysimulat = zeros(1,length(id_array));
lungime = length(id_array);
U = id_array(:,2)';
for k = 1:lungime
    y = [];
    for i = 1:na
        if (i>=k) 
            y = [0 y];
        else
            y = [ Ysimulat(k-i) y ];
        end
    end
    u = [];
    for i = nk:nk+nb-1
        if (i>=k)
            u = [0 u];
        else
            u = [ U(k-i) u ] ;
        end
    end
    
    if (length(u) > length(y))
        y = [ y ones(1,length(u)-length(y)) ];
    else
        u = [ u ones(1,length(y)-length(u)) ];
    end
    
    L_flat = [u' y'];
    L_flat_size = size(L_flat);
    L_flat_size = L_flat_size(1)*L_flat_size(2);
    L_flat = reshape(L_flat,1,L_flat_size);
    sigma=elemente_putere(L_flat,m);
    Ysimulat(k) = sigma*theta;
end

 Yid = id_array(:,3)';
 Yid = Yid(1:length(Yid));
 
 timp = id_array(:,1)';
 timp = timp(1:length(timp));
 
 figure
 plot(timp,Ysimulat,'r');
 hold on;
 plot(timp,Yid,'--k');
 xlabel('u');
 ylabel('y');
 
 MSE = 1/(length(Yid)).*(sum((Ysimulat-Yid).^2));
 title(['MSE Simulare pe datele de indentificare = ',num2str(MSE)]);
 legend('y-simulat','y-actual');
 
 
 

