# ProgettoGiocoDellOca

* Caratteristiche comuni a tutti i progetti.
Il progetto dovrà essere gestito interamente su github. Avrete un progetto privato, del quale faranno parte anche il prof. Zucchi ed io. Tutte le comunicazioni avverranno su github e un canale apposito su slack
La prima fase del progetto, della durata di una settimana (circa) è riservata alla progettazione. Al termine di questa fase dovrete consegnare un documento di progettazione (su github) comprendente
Schema UML delle classi. Vi è imporsta la limitazione che NESSUNA CLASSE deve stampare nulla (tranne il main) o avere in input nulla (tranne il main). Il motivo vi sarà chiaro in seguito. 
Organizzazione del lavoro: IDE, stima di ore settimanali, ruolo principale di ogni persona
La seconda fase del progetto consiste nella codifica. Committate spesso, terremo conto di quanto committate per dare una valutazione sull’impegno. Al termine di questa fase, dovrete fare una demo del programma. Tutto il codice deve essere committato su github e avere alcune caratteristiche che vi saranno rese note a breve
La terza fase, personale, consiste in una breve relazione che comprende l’autovalutazione e la valutazione del gruppo.

Progetto 1: “Gioco dell’oca”
Fate riferimento al Gioco dell’oca (https://it.wikipedia.org/wiki/Gioco_dell%27oca) . Il programma deve permettere di giocare da 1 a 4 giocatori, indicando il nome del giocatore stesso. Deve essere possibile interrompere la partita in ogni momento, e ogni giocatore può interrompere in ogni momento (se rimane un solo giocatore, questo è il vincitore). Si dovrà prevedere una “Hall of fame” delle vittorie dei giocatori. Deve essere possibile salvare il gioco a metà e riprenderlo.
La prima versione del gioco deve essere utilizzabile su terminale. Fatto questo (dopo avere il permesso esplicito da parte nostra), potete, se rimane tempo, iniziare a studiarvi Java FX Canvas, che faremo in laboratorio

Caselle speciali:

alla casella 6 ("il ponte") si paga la posta e si ripete il movimento come nelle caselle con le oche;
alla casella 19 ("casa" o "locanda") si paga la posta e si rimane fermi tre turni;
alle caselle 31 ("pozzo") e 52 ("prigione") si rimane fermi fino a quando non arriva nella casella un altro segnalino, che viene a sua volta "imprigionato";
alla casella 42 ("labirinto") si paga la posta e si torna alla 39;
alla casella 58 ("scheletro") si paga la posta e si torna alla 1.
La casella d'arrivo (la 63) deve essere raggiunta con un lancio di dadi esatto; altrimenti, giunti in fondo, si retrocede dei punti in eccesso.

* COMPONENTI GRUPPO:
  - MORSELLI
  - PAOLONI
  - GOLLINI
  - MICHELINI
  
* IDE UTILIZZATO: IntelliJ IDEA

* Indipendentemente dalla struttura che volte darvi, e dall'IDE che userete, dovrete avere una cartella "doc" in cui metterete tutta la documentezione di progetto (UML, commenti, schemi e altro che vi si potrà chiedere)
