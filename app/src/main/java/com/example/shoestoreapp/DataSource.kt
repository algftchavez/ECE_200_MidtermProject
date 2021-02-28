package com.example.shoestoreapp

object DataSource {
    private val list = listOf(
        Shoes(
            id = 1,
            name = "Crest Boat Smocked Hemp Sneaker",
            image = R.drawable.shoes1,
            shortDescription = "A boat shoe sneaker hybrid, versatile enough for dock to drink",
            description = "Lightweight textile upper, in seasonal seersucker, featuring rawhide barrel tie laces with our 360° Lacing System™ for a customized fit",
            price = 3860.50
        ), Shoes(
            id = 2,
            name = "Crest Vibe Leather Sneaker",
            image = R.drawable.shoes2,
            shortDescription = "The same essential sneaker silhouette you know and love, in a modern leather design",
            description = "Make them leather. Then pair them with a dress or blazer, and voila: your no-fuss, always comfortable, cut-above-casual look is complete",
            price = 4995.50
        ), Shoes(
            id = 3,
            name = "Crest Vibe Twill Sneaker",
            image = R.drawable.shoes3,
            shortDescription = "Memory Foam cushioned insole for all-day comfort, and a flexible non-marking rubber outsole for traction",
            description = "Our classic Crest Vibe Sneakers, punched up with extra personality in a seasonal twill. Finished with rawhide laces and a Memory Foam insole, they'll become an instant hit in your wardrobe.",
            price = 4550.00
        )

    )

    fun fetchData () = list

    fun getItem(id: Int) = list.find {
        it.id == Int

    }
}




