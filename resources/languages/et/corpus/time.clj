(
  ; Context map
  ; Tuesday Feb 12, 2013 at 4:30am is the "now" for the tests
  {:reference-time (time/t -2 2013 2 12 4 30 0)
   :min (time/t -2 1900)
   :max (time/t -2 2100)}

  "hetkel"
  "praegu"
  "praegusel hetkel"
  "just nüüd"
  (datetime 2013 2 12 4 30 00)
  
  "täna"
  (datetime 2013 2 12)

  "eile"
  (datetime 2013 2 11)

  "homme"
  (datetime 2013 2 13)
  
  "esmaspäev"
  "esmaspäeval"
  "esmasp."
  "sellel esmaspäeval"
  "see esmaspäev"
  (datetime 2013 2 18 :day-of-week 1)

  "Esmaspäev, 18. veebruar"
  "Esm, 18. veebruaril"
  (datetime 2013 2 18 :day-of-week 1 :day 18 :month 2)

  "teisipäev"
  "teisipäeval"
  "teisip."
  (datetime 2013 2 19)

  "kolmapäev"
  "kolmapäeval"
  "kolmap."
  (datetime 2013 2 20)

  "neljapäev"
  "neljapäeval"
  "neljap."
  (datetime 2013 2 14)

  "reede"
  "reedel"
  (datetime 2013 2 15)

  "laupäev"
  "laupäeval"
  "laup."
  (datetime 2013 2 16)

  "pühapäev"
  "pühapäeval"
  "pühap."
  (datetime 2013 2 17)
  
  "1. märtsil"
  "esimesel märtsil"
  (datetime 2013 3 1 :day 1 :month 3)
  
  "3. märtsil"
  (datetime 2013 3 3 :day 3 :month 3)

  "3. märts 2015"
  "3. märtsil 2015. a"
  "3. märtsil 2015"
  "3. III 2015"
  "03.03.2015"
  "3.3.2015"
  "3.3.15"
  (datetime 2015 3 3 :day 3 :month 3 :year 2015)

  "15."
  "viieteistkümnendal"
  "15ndal"
  (datetime 2013 2 15 :day 15)

  "15. veebruar"
  "15. veebruaril"
  "15ndal veebruaril"
  "viieteistkümnes veebruar"
  "viieteistkümnendal veebruaril"
  "15.2"
  "15.02"
  "15. II"
  (datetime 2013 2 15 :day 15 :month 2)

  "Aug 8"
  (datetime 2013 8 8 :day 8 :month 8)

  "Oktoober 2014"
  (datetime 2014 10 :year 2014 :month 10)
  
  "31.10.1974"
  "31.10.74"
  (datetime 1974 10 31 :day 31 :month 10 :year 1974)
  
  "14. aprill 2015"
  (datetime 2015 4 14 :day 14 :month 4 :years 2015)

  "järgmine teisipäev" ; when today is Tuesday, "mardi prochain" is a week from now
  "järgmisel teisipäeval"
  (datetime 2013 2 19 :day-of-week 2)

  "järgmise nädala reede"
  "järgmise nädala reedel"
  (datetime 2013 2 22 :day-of-week 2)

  "järgmine märts"
  "järgmisel märtsil"
  (datetime 2013 3)

  "ülejärgmine märts"
  "ülejärgmisel märtsil"
  (datetime 2014 3)

  "Pühapäev, 10. veebruar"
  (datetime 2013 2 10 :day-of-week 7 :day 10 :month 2) 
  
  "Kolmap, 13. veebr"
  (datetime 2013 2 13 :day-of-week 3 :day 13 :month 2)

  "Esmaspäev, 18. veebruar"
  "Esmasp, 18 veebruar"
  (datetime 2013 2 18 :day-of-week 1 :day 18 :month 2)

;   ;; Cycles
  
  "see nädal"
  "sel nädalal"
  (datetime 2013 2 11 :grain :week)

  "eelmine nädal"
  (datetime 2013 2 4 :grain :week)
  
  "järgmine nädal"
  (datetime 2013 2 18 :grain :week)
  
  "eelmine kuu"
  (datetime 2013 1)

  "järgmine kuu"
  (datetime 2013 3)
  
  "see kvartal"
  (datetime 2013 1 1 :grain :quarter)
  
  "järgmine kvartal"
  (datetime 2013 4 1 :grain :quarter)
  
  "kolmas kvartal"
  (datetime 2013 7 1 :grain :quarter)
  
  "neljas kvartal 2018"
  (datetime 2018 10 1 :grain :quarter)
  
  "eelmine aasta"
  (datetime 2012)
  
  "see aasta"
  (datetime 2013)
  
  "järgmine aasta"
  (datetime 2014)
    
  "eelmine pühapäev"
  "eelmise nädala pühapäev"
  (datetime 2013 2 10 :day-of-week 7)

  "eelmine teisipäev"
  (datetime 2013 2 5 :day-of-week 2)

  "järgmine teisipäev" ; when today is Tuesday, "mardi prochain" is a week from now
  (datetime 2013 2 19 :day-of-week 2)

  "järgmine kolmapäev" ; when today is Tuesday, "mercredi prochain" is tomorrow
  (datetime 2013 2 13 :day-of-week 3)

  "järgmise nädala kolmapäev"
  "tulev kolmapäev"
  (datetime 2013 2 20 :day-of-week 3)

  "järgmine reede"
  "tulev reede"
  (datetime 2013 2 22 :day-of-week 5)

  "selle nädala esmaspäev"
  (datetime 2013 2 11 :day-of-week 1)

  "selle nädala teisipäev"
  (datetime 2013 2 12 :day-of-week 2)

  "selle nädala kolmapäev"
  (datetime 2013 2 13 :day-of-week 3)

  "ülehomme"
  (datetime 2013 2 14)
  
  "üleile"
  (datetime 2013 2 10)
  
  "märtsi viimane esmaspäev"
  (datetime 2013 3 25 :day-of-week 1)
  
  "2014 aasta märtsi viimane pühapäev"
  (datetime 2014 3 30 :day-of-week 7)
  
  "oktoobri kolmas päev"
  (datetime 2013 10 3)
  
  "2014 aasta oktoobri esimene nädal"
  (datetime 2014 10 6 :grain :week)
  
  "2015 aasta oktoobri viimane päev"
  (datetime 2015 10 31)
  
  "2014 aasta septembri viimane nädal"
  (datetime 2014 9 22 :grain :week)
  
  
  ;; nth of
  "oktoobri esimene teisipäev"
  (datetime 2013 10 1)
  
  "2014 aasta septembri kolmas teisipäev"
  (datetime 2014 9 16)
  
  "2014 aasta oktoobri esimene teisipäev"
  (datetime 2014 10 1)
  
  "2014 aasta oktoobri teine kolmapäev"
  (datetime 2014 10 8)
  
  ;; nth after
  
  "kolmas teisipäev pärast 2014 aasta jõule"
  (datetime 2015 1 13)
    

  ;; Hours
  
  "kell 3 öösel"
  "kell 3"
  (datetime 2013 2 13 3)
  
  "3.18"
  "03.18"
  (datetime 2013 2 12 3 18)
  
  "kell kolm päeval"
  "kell 3 päeval"
  "kell 15.00 päeval"
  "kell 3 pärastlõunal"
  "kell 15.00 pärastlõunal"
  "15.00"
  (datetime 2013 2 12 15 :hour 3 :meridiem :pm)

  "kolme paiku"
  "kolme ajal"
  "umbes kolm"
  (datetime 2013 2 12 15 :hour 3 :meridiem :pm :precision "approximate")

  "homme täpselt viiest"
  (datetime 2013 2 13 17 :hour 5 :meridiem :pm :precision "exact")

  "15 minutit pärast kolme"
  "veerand tundi pärast kolme"
  "15.15 pärastlõunal"
  "15.15"
  (datetime 2013 2 12 15 15 :hour 3 :minute 15 :meridiem :pm)

  "20 minutit pärast kolme"
  "15.20 pärastlõunal"
  "kakskümmend minutit pärast kolme"
  (datetime 2013 2 12 15 20 :hour 3 :minute 20 :meridiem :pm)

  "pool tundi pärast kolme"
  "15.30"
  (datetime 2013 2 12 15 30 :hour 3 :minute 30 :meridiem :pm)
  
  "15.30"
  "pool neli"
  (datetime 2013 2 12 15 30 :hour 3 :minute 30)

  "veerand tundi enne lõunat"
  "15 minutit enne lõunat"
  "11.45"
  (datetime 2013 2 12 11 45 :hour 11 :minute 45)
    
  "20.00"
  "täna kell kaheksa"
  "täna kell 8"
  "täna õhtul kaheksast"
  "täna õhtul kell kaheksa"
  (datetime 2013 2 12 20)
 
  ;; Mixing date and time
    
  "19.30 reedel 20 septembril"
  "19.30 reedel kahekümnendal septembril"
  (datetime 2013 9 20 19 30 :hour 7 :minute 30 :meridiem :pm)
  
  "kell üheksa laupäeval"
  "kell üheksa hommikul laupäeval"
  "kell üheksa laupäeva hommikul"
  (datetime 2013 2 16 9 :day-of-week 6 :hour 9 :meridiem :am)

  "Reede, 18. juuli 2014 19.00"
  (datetime 2014 7 18 19 0 :day-of-week 5 :hour 7 :meridiem :pm)

  
; ;; Involving periods  
  
  "sekundi pärast"
  "ühe sekundi pärast"
  (datetime 2013 2 12 4 30 1)
  
  "minuti pärast"
  "ühe minuti pärast"
  (datetime 2013 2 12 4 31 0)
  
  "kahe minuti pärast"
  (datetime 2013 2 12 4 32 0)
  
  "kuuekümne minuti pärast"
  "60 minuti pärast"
  (datetime 2013 2 12 5 30 0)
  
  "poole tunni pärast"
  (datetime 2013 2 12 5 0 0)

  "kahe ja poole tunni pärast"
  "2.5h pärast"
  (datetime 2013 2 12 7 0 0)

  "in one hour"
  (datetime 2013 2 12 5 30)
  
  "paari tunni pärast"
  (datetime 2013 2 12 6 30)

  "mõne tunni pärast"
  (datetime 2013 2 12 7 30)

  "kahekümne nelja tunni pärast"
  "24h pärast"
  (datetime 2013 2 13 4 30)
  
  "päeva pärast"
  (datetime 2013 2 13 4)

  "kolme aasta pärast"
  (datetime 2016 2)

  "seitsme päeva pärast"
  "7 päeva pärast"
  (datetime 2013 2 19 4)

  "ühe nädala pärast"
  "nädala pärast"
  (datetime 2013 2 19)

  "umbes poole tunni pärast"
  (datetime 2013 2 12 5 0 0 :precision "approximate")

  "seitse päeva tagasi"
  (datetime 2013 2 5 4)

  "14 päeva tagasi"
  "neliteist päeva tagasi"
  "kaks nädalat tagasi"
  (datetime 2013 1 29 4)
  
  "nädal tagasi"
  "üks nädal tagasi"
  "1 nädal tagasi"
  (datetime 2013 2 5)

  "kolm nädalat tagasi"
  (datetime 2013 1 22)
  
  "kolm kuud tagasi"
  (datetime 2012 11 12)

  "kaks aastat tagasi"
  (datetime 2011 2)
  
  "7 päeva pärast"
  (datetime 2013 2 19 4)

  "14 päeva pärast"
  "kahe nädala pärast"
  (datetime 2013 2 26 4)
  
  "nädala pärast"
  "ühe nädala pärast"
  (datetime 2013 2 19)

  "kolme nädala pärast"
  (datetime 2013 3 5)
  
  "kolme kuu pärast"
  (datetime 2013 5 12)

  "kahe aasta pärast"
  (datetime 2015 2)
  
  "üks aasta pärast jõule"
  "aasta pärast jõule"
  (datetime 2013 12) ; resolves as after last Xmas...
  

  ; Seasons

  "see suvi"
  "tulev suvi"
  (datetime-interval [2013 6 21] [2013 9 24])

  "see talv"
  "tulev talv"
  (datetime-interval [2012 12 21] [2013 3 21])

  ; US holidays (http://www.timeanddate.com/holidays/us/)

  "jõulud"
  "jõululaupäev"
  (datetime 2013 12 25)

  "vana-aasta õhtu"
  (datetime 2013 12 31)

  "esimene jaanuar"
  (datetime 2014 1 1)

  "sõbrapäev"
  "valentinipäev"
  (datetime 2013 2 14)

;  "mälestamise päev"
;  (datetime 2013 5 27)

  "emadepäev"
  (datetime 2013 5 12)
  
  "isadepäev"
  (datetime 2013 6 16)

;  "memorial day week-end"
;  (datetime-interval [2013 5 24 18] [2013 5 28 0])

;  "independence day"
;  "4th of July"
;  "4 of july"
;  (datetime 2013 7 4)
;
;  "labor day"
;  (datetime 2013 9 2)

  "halloween"
  (datetime 2013 10 31)

;  "thanksgiving day"
;  "thanksgiving"
;  (datetime 2013 11 28)
  
  ; Part of day (morning, afternoon...)
  
  "õhtul"
  "täna õhtul"
  "täna"
  (datetime-interval [2013 2 12 18] [2013 2 13 00])

  "homme õhtul"
  (datetime-interval [2013 2 13 18] [2013 2 14 00])
  
  "eile õhtul"
  (datetime-interval [2013 2 11 18] [2013 2 12 00])
    
  "sel nädalavahetusel"
  "sel nv-l"
  "sel nvl"
  (datetime-interval [2013 2 15 18] [2013 2 18 00])

  "esmaspäeva hommikul"
  (datetime-interval [2013 2 18 4] [2013 2 18 12])

  "15. veebruari hommik"
  "15 veebruari hommik"
  "viieteistkümnenda veebruari hommik"
  (datetime-interval [2013 2 15 4] [2013 2 15 12])

  
  ; Intervals involving cycles
  
  "viimased 2 sekundit"
  "viimased kaks sekundit"
  (datetime-interval [2013 2 12 4 29 58] [2013 2 12 4 30 00])

  "järgmised kolm sekundit"
  "järgmised 3 sekundit"
  (datetime-interval [2013 2 12 4 30 01] [2013 2 12 4 30 04])

  "viimased kaks minutit"
  "viimased 2 minutit"
  (datetime-interval [2013 2 12 4 28] [2013 2 12 4 30])

  "järgmised 3 minutit"
  "järgmised kolm minutit"
  (datetime-interval [2013 2 12 4 31] [2013 2 12 4 34])

  "viimane tund"
  (datetime-interval [2013 2 12 3] [2013 2 12 4])

  "järgmised 3 tundi"
  "järgmised kolm tundi"
  (datetime-interval [2013 2 12 5] [2013 2 12 8])

  "viimased kaks päeva"
  "viimased 2 päeva"
  "möödunud 2 päeva"
  "möödunud kaks päeva"
  "eelmised 2 päeva"
  "eelmised kaks päeva"
  (datetime-interval [2013 2 10] [2013 2 12])

  "järgmised 3 päeva"
  "järgmised kolm päeva"
  (datetime-interval [2013 2 13] [2013 2 16])
    
  "järgmised paar päeva"
  (datetime-interval [2013 2 13] [2013 2 16])

  "viimased 2 nädalat"
  "viimased kaks nädalat"
  "möödunud 2 nädalat"
  "möödunud kaks nädalat"
  "eelmised 2 nädalat"
  "eelmised kaks nädalat"
  (datetime-interval [2013 1 28 :grain :week] [2013 2 11 :grain :week])

  "järgmised 3 nädalat"
  "järgmised kolm nädalat"
  (datetime-interval [2013 2 18 :grain :week] [2013 3 11 :grain :week])

  "viimased 2 kuud"
  "viimased kaks kuud"
  (datetime-interval [2012 12] [2013 02])

  "järgmised 3 kuud"
  "järgmised kolm kuud"
  (datetime-interval [2013 3] [2013 6])

  "viimased 2 aastat"
  "viimased kaks aastat"
  (datetime-interval [2011] [2013])
  
  "järgmised kolm aastat"
  "järgmised 3 aastat"
  (datetime-interval [2014] [2017])

  
  ; Explicit intervals

  "13.-15. juuli"
  "13. kuni 15. juuli"
  "13. juuli kuni 15. juuli"
  "13. juuli - 15. juuli"
  (datetime-interval [2013 7 13] [2013 7 16])

  "8. august - 12. august"
  (datetime-interval [2013 8 8] [2013 8 13])
  
  "9.30 - 11.00"
  (datetime-interval [2013 2 12 9 30] [2013 2 12 11 1])

  "9.30 - 11.00 neljapäeval"
  "9.30 kuni 11.00 neljapäeval"
  "alates 9.30 kuni 11.00 neljapäeval"
  (datetime-interval [2013 2 14 9 30] [2013 2 14 11 1])

  "Neljapäeval üheksast üheteistkümneni"
  "Neljapäeval 9.00 kuni 11.00"
  "Neljapäeval 9.00 - 11.00"
  (datetime-interval [2013 2 14 9] [2013 2 14 12])
  
  "11.30-13.30" ; go train this rule!
  "11.30-13.30"
  "11.30-13.30"
  "11.30-13.30"
  "11.30-13.30"
  "11.30-13.30"
  "11.30-13.30"
  (datetime-interval [2013 2 12 11 30] [2013 2 12 13 31])

  "13.30 laupäeval, 21. septembril"
  (datetime 2013 9 21 13 30)
  
  "kahe nädala jooksul"
  (datetime-interval [2013 2 12 4 30 0] [2013 2 26])

  "kuni kaheni"
  "kuni 14.00"
  "kuni kella kaheni"
  (datetime-interval [2013 2 12 4 30 0] [2013 2 12 14])

  "kaheks"
  "kella kaheks"
  (datetime-interval [2013 2 12 4 30 0] [2013 2 12 14])

  "päeva lõõpuks"
  (datetime-interval [2013 2 12 4 30 0] [2013 2 13 0])

  "kuu lõpuks"
  (datetime-interval [2013 2 12 4 30 0] [2013 3 1 0])

  "järgmise kuu lõpuks"
  (datetime-interval [2013 2 12 4 30 0] [2013 4 1 0])
  ; Timezones
  
  "kell neli CET"
  "kell 4 CET"
  (datetime 2013 2 12 16 :hour 4 :meridiem :pm :timezone "CET")

  "neljapäeval 8:00 GMT"
  (datetime 2013 2 14 8 00 :timezone "GMT")  
)
