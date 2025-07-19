package com.example.abachoose.domain

import androidx.compose.ui.graphics.Color
import com.example.abachoose.R

fun makeAbTest(): Test {
    return Test(
        name = "abTest",
        displayName = "AB Test",
        listOf<Question>(
            Question(
                name = "dog_cat",
                question = "dog?",
                answer = "dog",
                option1Name = "dog",
                option1ImgSrc = R.drawable.dog,
                option2Name = "cat",
                option2ImgSrc = R.drawable.cat,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "dog_cat",
                question = "cat?",
                answer = "cat",
                option1Name = "dog",
                option1ImgSrc = R.drawable.dog,
                option2Name = "cat",
                option2ImgSrc = R.drawable.cat,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "fork_spoon",
                question = "fork?",
                answer = "fork",
                option1Name = "fork",
                option1ImgSrc = R.drawable.fork,
                option2Name = "spoon",
                option2ImgSrc = R.drawable.spoon,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "fork_spoon",
                question = "spoon?",
                answer = "spoon",
                option1Name = "fork",
                option1ImgSrc = R.drawable.fork,
                option2Name = "spoon",
                option2ImgSrc = R.drawable.spoon,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "car_train",
                question = "car?",
                answer = "car",
                option1Name = "car",
                option1ImgSrc = R.drawable.car,
                option2Name = "train",
                option2ImgSrc = R.drawable.train,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "car_train",
                question = "train?",
                answer = "train",
                option1Name = "car",
                option1ImgSrc = R.drawable.car,
                option2Name = "train",
                option2ImgSrc = R.drawable.train,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "baseball_football",
                question = "baseball?",
                answer = "baseball",
                option1Name = "baseball",
                option1ImgSrc = R.drawable.baseball,
                option2Name = "football",
                option2ImgSrc = R.drawable.football,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "baseball_football",
                question = "football?",
                answer = "football",
                option1Name = "baseball",
                option1ImgSrc = R.drawable.baseball,
                option2Name = "football",
                option2ImgSrc = R.drawable.football,
                score = 0,
                answered = false,
                answeredCorrectly = null

            ),
            Question(
                name = "chair_table",
                question = "chair?",
                answer = "chair",
                option1Name = "chair",
                option1ImgSrc = R.drawable.chair,
                option2Name = "table",
                option2ImgSrc = R.drawable.table,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "chair_table",
                question = "table?",
                answer = "table",
                option1Name = "chair",
                option1ImgSrc = R.drawable.chair,
                option2Name = "table",
                option2ImgSrc = R.drawable.table,
                score = 0,
                answered = false,
                answeredCorrectly = null
            )
        ).shuffled(),
        totalScore = 0
    )
}

fun makeColorTest(): Test {
    return Test(
        name = "colorTest",
        displayName = "Color Test",
        listOf<Question>(
            Question(
                name = "blue_green",
                question = "blue?",
                answer = "blue",
                option1Name = "blue",
                option1ImgSrc = R.drawable.blue,
                option2Name = "green",
                option2ImgSrc = R.drawable.green,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "blue_green",
                question = "green?",
                answer = "green",
                option1Name = "blue",
                option1ImgSrc = R.drawable.blue,
                option2Name = "green",
                option2ImgSrc = R.drawable.green,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "black_orange",
                question = "black?",
                answer = "black",
                option1Name = "black",
                option1ImgSrc = R.drawable.black,
                option2Name = "orange",
                option2ImgSrc = R.drawable.orange,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "black_orange",
                question = "orange?",
                answer = "orange",
                option1Name = "black",
                option1ImgSrc = R.drawable.black,
                option2Name = "orange",
                option2ImgSrc = R.drawable.orange,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "purple_red",
                question = "purple?",
                answer = "purple",
                option1Name = "purple",
                option1ImgSrc = R.drawable.purple,
                option2Name = "red",
                option2ImgSrc = R.drawable.red,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "purple_red",
                question = "red?",
                answer = "red",
                option1Name = "purple",
                option1ImgSrc = R.drawable.purple,
                option2Name = "red",
                option2ImgSrc = R.drawable.red,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "yellow_brown",
                question = "yellow?",
                answer = "yellow",
                option1Name = "yellow",
                option1ImgSrc = R.drawable.yellow,
                option2Name = "brown",
                option2ImgSrc = R.drawable.brown,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "yellow_brown",
                question = "brown?",
                answer = "brown",
                option1Name = "yellow",
                option1ImgSrc = R.drawable.yellow,
                option2Name = "brown",
                option2ImgSrc = R.drawable.brown,
                score = 0,
                answered = false,
                answeredCorrectly = null
            )
        ).shuffled(),
        totalScore = 0
    )
}

fun makeLetterAssociationTest(): Test {
    return Test(
        name = "letterAssociationTest",
        displayName = "Letter Test",
        listOf<Question>(
            // A
            Question(
                name = "a_apple_strawberry",
                question = "a",
                answer = "apple",
                option1Name = "apple",
                option1ImgSrc = R.drawable.apple,
                option2Name = "strawberry",
                option2ImgSrc = R.drawable.strawberry,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // B
            Question(
                name = "b_boat_train",
                question = "b",
                answer = "boat",
                option1Name = "boat",
                option1ImgSrc = R.drawable.boat,
                option2Name = "train",
                option2ImgSrc = R.drawable.train,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // C
            Question(
                name = "c_castle_house",
                question = "c",
                answer = "castle",
                option1Name = "castle",
                option1ImgSrc = R.drawable.castle,
                option2Name = "house",
                option2ImgSrc = R.drawable.house,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // D
            Question(
                name = "d_dino_lion",
                question = "d",
                answer = "dino",
                option1Name = "dino",
                option1ImgSrc = R.drawable.dino,
                option2Name = "lion",
                option2ImgSrc = R.drawable.lion,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // E
            Question(
                name = "e_elephant_giraffe",
                question = "e",
                answer = "elephant",
                option1Name = "elephant",
                option1ImgSrc = R.drawable.elephant,
                option2Name = "giraffe",
                option2ImgSrc = R.drawable.giraffe,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // F
            Question(
                name = "f_frog_turtle",
                question = "f",
                answer = "frog",
                option1Name = "frog",
                option1ImgSrc = R.drawable.frog,
                option2Name = "turtle",
                option2ImgSrc = R.drawable.turtle,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // G
            Question(
                name = "g_gold_diamond",
                question = "g",
                answer = "gold",
                option1Name = "gold",
                option1ImgSrc = R.drawable.gold,
                option2Name = "diamond",
                option2ImgSrc = R.drawable.diamond,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // h
            Question(
                name = "h_honey_butterfly",
                question = "h",
                answer = "honey",
                option1Name = "honey",
                option1ImgSrc = R.drawable.honey,
                option2Name = "butterfly",
                option2ImgSrc = R.drawable.butterfly,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // I
            Question(
                name = "i_island_diamond",
                question = "i",
                answer = "island",
                option1Name = "island",
                option1ImgSrc = R.drawable.island,
                option2Name = "mountain",
                option2ImgSrc = R.drawable.mountain,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            // J
            Question(
                name = "j_juice_milk",
                question = "j",
                answer = "juice",
                option1Name = "juice",
                option1ImgSrc = R.drawable.juice,
                option2Name = "milk",
                option2ImgSrc = R.drawable.milk,
                score = 0,
                answered = false,
                answeredCorrectly = null
            )
        ).shuffled(),
        totalScore = 0
    )
}

fun makeWordAssociationTest(): Test {
    return Test(
        name = "wordAssociationTest",
        displayName = "Word Test",
        listOf<Question>(
            Question(
                name = "apple_tree_house",
                question = "apple?",
                answer = "tree",
                option1Name = "tree",
                option1ImgSrc = R.drawable.tree,
                option2Name = "house",
                option2ImgSrc = R.drawable.house,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "fish_ocean_desert",
                question = "fish?",
                answer = "ocean",
                option1Name = "ocean",
                option1ImgSrc = R.drawable.ocean,
                option2Name = "desert",
                option2ImgSrc = R.drawable.desert,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "airplane_sky_forest",
                question = "airplane?",
                answer = "sky",
                option1Name = "sky",
                option1ImgSrc = R.drawable.sky,
                option2Name = "forest",
                option2ImgSrc = R.drawable.forest,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "boat_ocean_desert",
                question = "boat?",
                answer = "ocean",
                option1Name = "ocean",
                option1ImgSrc = R.drawable.ocean,
                option2Name = "desert",
                option2ImgSrc = R.drawable.desert,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "monkey_forest_sky",
                question = "monkey?",
                answer = "forest",
                option1Name = "forest",
                option1ImgSrc = R.drawable.forest,
                option2Name = "sky",
                option2ImgSrc = R.drawable.sky,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "planet_space_atom",
                question = "planet?",
                answer = "space",
                option1Name = "space",
                option1ImgSrc = R.drawable.space,
                option2Name = "atom",
                option2ImgSrc = R.drawable.atom,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "cold_ice_fire",
                question = "cold?",
                answer = "ice",
                option1Name = "ice",
                option1ImgSrc = R.drawable.ice,
                option2Name = "fire",
                option2ImgSrc = R.drawable.fire,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "hot_fire_ice",
                question = "hot?",
                answer = "fire",
                option1Name = "fire",
                option1ImgSrc = R.drawable.fire,
                option2Name = "ice",
                option2ImgSrc = R.drawable.ice,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "egg_chicken_cow",
                question = "egg?",
                answer = "chicken",
                option1Name = "chicken",
                option1ImgSrc = R.drawable.chicken,
                option2Name = "cow",
                option2ImgSrc = R.drawable.cow,
                score = 0,
                answered = false,
                answeredCorrectly = null
            ),
            Question(
                name = "milk_cow_chicken",
                question = "milk?",
                answer = "cow",
                option1Name = "cow",
                option1ImgSrc = R.drawable.cow,
                option2Name = "chicken",
                option2ImgSrc = R.drawable.chicken,
                score = 0,
                answered = false,
                answeredCorrectly = null
            )
        ).shuffled(),
        totalScore = 0
    )
}
