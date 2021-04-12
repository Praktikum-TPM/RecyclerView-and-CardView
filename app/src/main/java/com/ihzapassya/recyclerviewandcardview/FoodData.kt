package com.ihzapassya.recyclerviewandcardview

import com.ihzapassya.recyclerviewandcardview.FoodModel

object FoodData {
    private var data = arrayOf(
        arrayOf(
            "https://i.postimg.cc/fkBgFrL6/burger.png",
            "Burger",
            "Burger is blablabla lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/dhTHhQBY/hot-dog.png",
            "Hot Dog",
            "Hot Dog is nyamnyam lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/d7PWrMHT/sandwich.png",
            "Sanwich",
            "Sanwich is bombom lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/fkBgFrL6/burger.png",
            "Burger",
            "Burger is blablabla lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/dhTHhQBY/hot-dog.png",
            "Hot Dog",
            "Hot Dog is nyamnyam lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/d7PWrMHT/sandwich.png",
            "Sanwich",
            "Sanwich is bombom lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/fkBgFrL6/burger.png",
            "Burger",
            "Burger is blablabla lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/dhTHhQBY/hot-dog.png",
            "Hot Dog",
            "Hot Dog is nyamnyam lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/d7PWrMHT/sandwich.png",
            "Sanwich",
            "Sanwich is bombom lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/fkBgFrL6/burger.png",
            "Burger",
            "Burger is blablabla lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/dhTHhQBY/hot-dog.png",
            "Hot Dog",
            "Hot Dog is nyamnyam lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        ),
        arrayOf(
            "https://i.postimg.cc/d7PWrMHT/sandwich.png",
            "Sanwich",
            "Sanwich is bombom lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias consequatur maxime quasi aliquid cum impedit rem. Sunt ipsa eius suscipit excepturi facilis, eum incidunt, itaque reprehenderit obcaecati eos maxime similique minus iusto explicabo rem, ex vitae possimus, tempore totam culpa aliquid fuga sapiente. Dolorum tempora mollitia ipsam laboriosam, esse commodi placeat tenetur reprehenderit alias sit laudantium magni maiores atque illo facere."
        )
    )

    val listData: ArrayList<FoodModel>
        get() {
            val list = ArrayList<FoodModel>()
            for (Data in data) {
                val food = FoodModel()
                food.image = Data[0]
                food.name = Data[1]
                food.summary = Data[2]
                list.add(food)
            }
            return list
        }
}