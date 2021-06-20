package com.dicoding.mymoviecatalogueapp.utils

import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity
import com.dicoding.mymoviecatalogueapp.data.source.remote.response.CatalogueResponse

object DataCatalogueDummy {

    fun generateRemoteDummyMoviesCatalogue(): List<CatalogueResponse> {
        val listMoviesCatalogue = ArrayList<CatalogueResponse>()

        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov001",
                "https://www.themoviedb.org/t/p/original/c0VpT2UiEEwd5vODup31WfXenzb.jpg",
                "Aquaman",
                "PG-13",
                "Action, Adventure, Fantasy",
                "2h 13m",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "69%",
                "December 7, 2018",
                "2018",
                "https://youtu.be/2wcj6SrX4zw"
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov002",
                "https://www.themoviedb.org/t/p/original/8Ah3yB8gb0OSQb2Qk5IclBm1UOC.jpg",
                "Bohemian Rhapsody",
                "PG-13",
                "Music, Drama, History",
                "2h 15m",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "80%",
                "October 24, 2018",
                "2018",
                "https://youtu.be/mP0VHJYFOAU"
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov003",
                "https://www.themoviedb.org/t/p/original/pdKl6tyEXLhHVChCUjKMz28wW3K.jpg",
                "Cold Persuit",
                "R",
                "Action, Crime, Thriller",
                "1h 59m",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "57%",
                "February 17, 2019",
                "2019",
                "https://youtu.be/0phuNQQ_gHI"
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov004",
                "https://www.themoviedb.org/t/p/original/quYXtLo1SVxYHr4LgxMMw569nHQ.jpg",
                "Creed II",
                "PG-13",
                "Drama",
                "2h 10m",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "69%",
                "November 21, 2018",
                "2018",
                "https://youtu.be/cPNVNqn4T9I"
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov005",
                "https://www.themoviedb.org/t/p/original/A46T6ic1Vr0WrrEXuksnJ2ExxbD.jpg",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "PG-13",
                "Adventure, Fantasy, Drama",
                "2h 14m",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "69%",
                "November 4, 2018",
                "2018",
                "https://youtu.be/8bYBOVWLNIs",
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov006",
                "https://www.themoviedb.org/t/p/original/35FXS4XSH3Nqi9E6UhJISCV74pf.jpg",
                "Glass",
                "PG-13",
                "Thriller, Drama, Science Fiction",
                "2h 9m",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "67%",
                "January 16, 2019",
                "2019",
                "https://youtu.be/95ghQs5AmNk"
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov007",
                "https://www.themoviedb.org/t/p/original/5YQQNdUTVLuPlTTmR54g5Vx7D4K.jpg",
                "How to Train Your Dragon: The Hidden World",
                "PG",
                "Animation, Family, Adventure",
                "1h 44m",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "78%",
                "January 3, 2019",
                "2019",
                "https://youtu.be/qLTDtbYmdWM"
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov008",
                "https://www.themoviedb.org/t/p/original/rQpd7eMhzQxCF90c8ITNqZDFCQu.jpg",
                "Avengers: Invinity War",
                "PG-13",
                "Adventure, Action, Science Fiction",
                "2h 29m",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "83%",
                "April 25, 2018",
                "2018",
                "https://youtu.be/6ZfuNTqbHE8"
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov009",
                "https://www.themoviedb.org/t/p/original/kn6A0SsdmpyIopecfWQoQadcLYB.jpg",
                "Wreck-It Ralph",
                "PG",
                "Family, Animation, Comedy, Adventure",
                "1h 41m",
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                "73%",
                "January 1, 2012",
                "2012",
                "https://youtu.be/JPSQOomMWro"
            )
        )
        listMoviesCatalogue.add(
            CatalogueResponse(
                "mov010",
                "https://www.themoviedb.org/t/p/original/ltuwOEAJ4rfGVLdC4YYmCYBVcQV.jpg",
                "Spider-Man",
                "PG-13",
                "Fantasy, Action",
                "2h 1m",
                "After being bitten by a genetically altered spider, nerdy high school student Peter Parker is endowed with amazing powers to become the Amazing superhero known as Spider-Man.",
                "72%",
                "May 1, 2002",
                "2002",
                "https://youtu.be/O7zvehDxttM"
            )
        )

        return listMoviesCatalogue
    }

    fun generateRemoteDummyTvshowsCatalogue(): List<CatalogueResponse> {
        val listTvshowsCatalogue = ArrayList<CatalogueResponse>()

        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs001",
                "https://www.themoviedb.org/t/p/original/5NM63IzApefKcuOJfpT0VcCufAb.jpg",
                "Arrow",
                "TV-14",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "67%",
                "October 10, 2012",
                "2012",
                "https://youtu.be/hTv13EjlLNg"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs002",
                "https://www.themoviedb.org/t/p/original/oEhKUJoTLi96cBQXuDCj0XzQABg.jpg",
                "Doom Patrol",
                "TV-MA",
                "Sci-Fi & Fantasy, Comedy, Drama",
                "49m",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "76%",
                "February 15, 2019",
                "2019",
                "https://youtu.be/6tTM9nbRk5A"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs003",
                "https://www.themoviedb.org/t/p/original/6r9g6wDvQp85gheYwPFJme9CTvt.jpg",
                "Dragon Ball",
                "TV-PG",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25m",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                "81%",
                "February 26, 1986",
                "1986",
                "https://youtu.be/y_0APzy4BcU"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs004",
                "https://www.themoviedb.org/t/p/original/1C6D295RiMKjerq5Z22zVVfyndz.jpg",
                "Fairy Tail",
                "TV-14",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy, Mystery",
                "25m",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "78%",
                "October 12, 2009",
                "2009",
                "https://youtu.be/29jsKEZN1ag"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs005",
                "https://www.themoviedb.org/t/p/original/xtIFsv0Wpy29Bw7i8gUm1L9x6x8.jpg",
                "Family Guy",
                "TV-14",
                "Animation, Comedy",
                "22m",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "70%",
                "January 31, 1999",
                "1999",
                "https://youtu.be/vIKlVgw_b90"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs006",
                "https://www.themoviedb.org/t/p/original/n87ur88ehi24uEqiWrbfqwwSvt8.jpg",
                "The Flash",
                "TV-14",
                "Drama, Sci-Fi & Fantasy",
                "44m",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "77%",
                "October 7, 2014",
                "2014",
                "https://youtu.be/Yj0l7iGKh8g"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs007",
                "https://www.themoviedb.org/t/p/original/4NLXW8QCCKayIBZZJh51ZXhV69R.jpg",
                "The Walking Dead",
                "TV-MA",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "42m",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "81%",
                "October 31, 2010",
                "2010",
                "https://youtu.be/R1v0uFms68U"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs008",
                "https://www.themoviedb.org/t/p/original/jhXYAHAAlTjWOpK3sW9oaqDmvoT.jpg",
                "Gotham",
                "TV-14",
                "Drama, Crime, Sci-Fi & Fantasy",
                "43m",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "75%",
                "September 22, 2014",
                "2014",
                "https://www.youtube.com/watch?v=VwOPA2upeCA"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs009",
                "https://www.themoviedb.org/t/p/original/466YXWdIyf7ZY0p4BZZusJBfoxt.jpg",
                "Naruto Shippūden",
                "TV-14",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25m",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "86%",
                "February 15, 2007",
                "2007",
                "https://youtu.be/1WLO0Owi5-A"
            )
        )
        listTvshowsCatalogue.add(
            CatalogueResponse(
                "tvs010",
                "https://www.themoviedb.org/t/p/original/bb9MBgFgdHJY1QC4nZShovkP7A3.jpg",
                "Supernatural",
                "TV-14",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45m",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "82%",
                "September 13, 2005",
                "2005",
                "https://youtu.be/yy96yJjkvjo"
            )
        )
        return listTvshowsCatalogue
    }


    fun generateDummyMoviesCatalogue(): List<CatalogueEntity> {
        val listMoviesCatalogue = ArrayList<CatalogueEntity>()

        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov001",
                "https://www.themoviedb.org/t/p/original/c0VpT2UiEEwd5vODup31WfXenzb.jpg",
                "Aquaman",
                "PG-13",
                "Action, Adventure, Fantasy",
                "2h 13m",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "69%",
                "December 7, 2018",
                "2018",
                "https://youtu.be/2wcj6SrX4zw"
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov002",
                "https://www.themoviedb.org/t/p/original/8Ah3yB8gb0OSQb2Qk5IclBm1UOC.jpg",
                "Bohemian Rhapsody",
                "PG-13",
                "Music, Drama, History",
                "2h 15m",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "80%",
                "October 24, 2018",
                "2018",
                "https://youtu.be/mP0VHJYFOAU"
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov003",
                "https://www.themoviedb.org/t/p/original/pdKl6tyEXLhHVChCUjKMz28wW3K.jpg",
                "Cold Persuit",
                "R",
                "Action, Crime, Thriller",
                "1h 59m",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "57%",
                "February 17, 2019",
                "2019",
                "https://youtu.be/0phuNQQ_gHI"
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov004",
                "https://www.themoviedb.org/t/p/original/quYXtLo1SVxYHr4LgxMMw569nHQ.jpg",
                "Creed II",
                "PG-13",
                "Drama",
                "2h 10m",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "69%",
                "November 21, 2018",
                "2018",
                "https://youtu.be/cPNVNqn4T9I"
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov005",
                "https://www.themoviedb.org/t/p/original/A46T6ic1Vr0WrrEXuksnJ2ExxbD.jpg",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "PG-13",
                "Adventure, Fantasy, Drama",
                "2h 14m",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "69%",
                "November 4, 2018",
                "2018",
                "https://youtu.be/8bYBOVWLNIs",
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov006",
                "https://www.themoviedb.org/t/p/original/35FXS4XSH3Nqi9E6UhJISCV74pf.jpg",
                "Glass",
                "PG-13",
                "Thriller, Drama, Science Fiction",
                "2h 9m",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "67%",
                "January 16, 2019",
                "2019",
                "https://youtu.be/95ghQs5AmNk"
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov007",
                "https://www.themoviedb.org/t/p/original/5YQQNdUTVLuPlTTmR54g5Vx7D4K.jpg",
                "How to Train Your Dragon: The Hidden World",
                "PG",
                "Animation, Family, Adventure",
                "1h 44m",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "78%",
                "January 3, 2019",
                "2019",
                "https://youtu.be/qLTDtbYmdWM"
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov008",
                "https://www.themoviedb.org/t/p/original/rQpd7eMhzQxCF90c8ITNqZDFCQu.jpg",
                "Avengers: Invinity War",
                "PG-13",
                "Adventure, Action, Science Fiction",
                "2h 29m",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "83%",
                "April 25, 2018",
                "2018",
                "https://youtu.be/6ZfuNTqbHE8"
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov009",
                "https://www.themoviedb.org/t/p/original/kn6A0SsdmpyIopecfWQoQadcLYB.jpg",
                "Wreck-It Ralph",
                "PG",
                "Family, Animation, Comedy, Adventure",
                "1h 41m",
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                "73%",
                "January 1, 2012",
                "2012",
                "https://youtu.be/JPSQOomMWro"
        )
        )
        listMoviesCatalogue.add(
                CatalogueEntity(
                "mov010",
                "https://www.themoviedb.org/t/p/original/ltuwOEAJ4rfGVLdC4YYmCYBVcQV.jpg",
                "Spider-Man",
                "PG-13",
                "Fantasy, Action",
                "2h 1m",
                "After being bitten by a genetically altered spider, nerdy high school student Peter Parker is endowed with amazing powers to become the Amazing superhero known as Spider-Man.",
                "72%",
                "May 1, 2002",
                "2002",
                "https://youtu.be/O7zvehDxttM"
        )
        )

        return listMoviesCatalogue
    }

    fun generateDummyTvshowsCatalogue(): List<CatalogueEntity> {
        val listTvshowsCatalogue = ArrayList<CatalogueEntity>()

        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs001",
                "https://www.themoviedb.org/t/p/original/5NM63IzApefKcuOJfpT0VcCufAb.jpg",
                "Arrow",
                "TV-14",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "67%",
                "October 10, 2012",
                "2012",
                "https://youtu.be/hTv13EjlLNg"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs002",
                "https://www.themoviedb.org/t/p/original/oEhKUJoTLi96cBQXuDCj0XzQABg.jpg",
                "Doom Patrol",
                "TV-MA",
                "Sci-Fi & Fantasy, Comedy, Drama",
                "49m",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "76%",
                "February 15, 2019",
                "2019",
                "https://youtu.be/6tTM9nbRk5A"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs003",
                "https://www.themoviedb.org/t/p/original/6r9g6wDvQp85gheYwPFJme9CTvt.jpg",
                "Dragon Ball",
                "TV-PG",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25m",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                "81%",
                "February 26, 1986",
                "1986",
                "https://youtu.be/y_0APzy4BcU"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs004",
                "https://www.themoviedb.org/t/p/original/1C6D295RiMKjerq5Z22zVVfyndz.jpg",
                "Fairy Tail",
                "TV-14",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy, Mystery",
                "25m",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "78%",
                "October 12, 2009",
                "2009",
                "https://youtu.be/29jsKEZN1ag"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs005",
                "https://www.themoviedb.org/t/p/original/xtIFsv0Wpy29Bw7i8gUm1L9x6x8.jpg",
                "Family Guy",
                "TV-14",
                "Animation, Comedy",
                "22m",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "70%",
                "January 31, 1999",
                "1999",
                "https://youtu.be/vIKlVgw_b90"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs006",
                "https://www.themoviedb.org/t/p/original/n87ur88ehi24uEqiWrbfqwwSvt8.jpg",
                "The Flash",
                "TV-14",
                "Drama, Sci-Fi & Fantasy",
                "44m",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "77%",
                "October 7, 2014",
                "2014",
                "https://youtu.be/Yj0l7iGKh8g"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs007",
                "https://www.themoviedb.org/t/p/original/4NLXW8QCCKayIBZZJh51ZXhV69R.jpg",
                "The Walking Dead",
                "TV-MA",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "42m",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "81%",
                "October 31, 2010",
                "2010",
                "https://youtu.be/R1v0uFms68U"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs008",
                "https://www.themoviedb.org/t/p/original/jhXYAHAAlTjWOpK3sW9oaqDmvoT.jpg",
                "Gotham",
                "TV-14",
                "Drama, Crime, Sci-Fi & Fantasy",
                "43m",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "75%",
                "September 22, 2014",
                "2014",
                "https://www.youtube.com/watch?v=VwOPA2upeCA"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs009",
                "https://www.themoviedb.org/t/p/original/466YXWdIyf7ZY0p4BZZusJBfoxt.jpg",
                "Naruto Shippūden",
                "TV-14",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25m",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "86%",
                "February 15, 2007",
                "2007",
                "https://youtu.be/1WLO0Owi5-A"
        )
        )
        listTvshowsCatalogue.add(
                CatalogueEntity(
                "tvs010",
                "https://www.themoviedb.org/t/p/original/bb9MBgFgdHJY1QC4nZShovkP7A3.jpg",
                "Supernatural",
                "TV-14",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45m",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "82%",
                "September 13, 2005",
                "2005",
                "https://youtu.be/yy96yJjkvjo"
        )
        )
        return listTvshowsCatalogue
    }
}