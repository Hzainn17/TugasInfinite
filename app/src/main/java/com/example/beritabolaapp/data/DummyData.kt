package com.example.beritabolaapp.data

import com.example.beritabolaapp.R
import com.example.beritabolaapp.model.Club
import com.example.beritabolaapp.model.LogoClub
import com.example.beritabolaapp.model.Player

object DummyData {
    val muPlayers = listOf(
        Player (
            id = 1,
            name = "David de Gea Quintana",
            age = 28,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            position = "Goal Kepaer",
            playerImageId = R.drawable.p1
        ),
        Player(
            id = 2,
            name = "Eric Bertrand Bailly",
            age = 30,
            position = "Center Back",
            description = "Jubilee enjoys thoughtful discussions by the campfire.",
            playerImageId = R.drawable.p2
        ),
        Player(
            id = 3,
            name = "Victor Jörgen Nilsson Lindelöf",
            age = 28,
            position = "Center Back",
            description = "Beezy's favorite past-time is helping you choose your brand color.",
            playerImageId = R.drawable.p3
        ),
        Player(
            id = 4,
            name = "Jacob Harry Maguire",
            age = 30,
            position = "Rigth Back",
            description = "Mochi is the perfect \"rubbery ducky\" debugging pup, always listening.",
            playerImageId = R.drawable.p4
        ),
        Player(
            id = 5,
            name = "Luke Paul Hoare Shaw",
            age = 12,
            position = "left Back",
            description = "Brewery loves fetching you your favorite homebrew.",
            playerImageId = R.drawable.p5
        ),
        Player(
            id = 6,
            name = "Bruno Miguel Borges Fernandes",
            age = 28,
            position = "Central Midfielder",
            description = "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
            playerImageId = R.drawable.p6
        ),
        Player(
            id = 7,
            name = "Frederico Rodrigues de Paula Santos",
            age = 25,
            position = "Right Midfielder",
            description = "Is it a bird? A plane? No, it's Astro blasting off into your heart!",
            playerImageId = R.drawable.p7
        ),
        Player(
            id = 8,
            name = "Paul Labile Pogba",
            age = 29,
            position = "Left Midfielder",
            description = "Boo is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
            playerImageId = R.drawable.p8
        ),
        Player(
            id = 9,
            name = "Edinson Roberto Gómez Cavani",
            age = 27,
            position = "Central attacking midfielder",
            description = "Pippa likes to look out the window and write pup-poetry.",
            playerImageId = R.drawable.p9
        ),
        Player(
            id = 10,
            name = "Mason Will John Greenwood",
            age = 20,
            position = "Right winger",
            description = "Coco enjoys getting pampered at the local puppy spa.",
            playerImageId = R.drawable.p10
        ),
        Player(
            id = 11,
            name = "Daniel Owen James",
            age = 23,
            position = "Left winger",
            description = "Brody is a good boy, waiting for your next command.",
            playerImageId = R.drawable.p11
        ),
        Player(
            id = 12,
            name = "Marcus Rashford",
            age = 24,
            position = "Central forward",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            playerImageId = R.drawable.p12
        ),
    )

    val dataClub = listOf(
        Club (
            id = 1,
            name = "MU",
        ),
        Club(
            id = 2,
            name = "Liverpool"
        ),
        Club(
            id = 3,
            name = "Barcelona"
        ),
        Club(
            id = 4,
            name = "PSG"
        ),
        Club(
            id = 5,
            name = "Arsenal"
        ),
        Club(
            id = 6,
            name = "Chelsea"
        ),
        Club(
            id = 7,
            name = "Real Madrid"
        ),
        Club(
            id = 8,
            name = "Tottenham"
        ),
        Club(
            id = 9,
            name = "Stoke City"
        ),
        Club(
            id = 10,
            name = "Fulham"
        ),
    )

    val datalogoClub = listOf(
        LogoClub (
            id = 1,
            name = "Manchester United",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.muu
        ),
        LogoClub(
            id = 2,
            name = "Barcelona",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c2
        ),
        LogoClub(
            id = 3,
            name = "PSG",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c3
        ),
        LogoClub(
            id = 4,
            name = "Liverpool",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c4
        ),
        LogoClub(
            id = 5,
            name = "Arsenal",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c5
        ),
        LogoClub(
            id = 6,
            name = "Real Madrid",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c6
        ),
        LogoClub(
            id = 7,
            name = "Chelsea",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c7
        ),
        LogoClub(
            id = 8,
            name = "Tottenham",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c8
        ),
        LogoClub(
            id = 9,
            name = "Manchester City",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c9
        ),
        LogoClub(
            id = 10,
            name = "Fulham",
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            logoClubImageId = R.drawable.c10
        ),
    )
}