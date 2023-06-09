package com.labactivity.kitchenkonek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.labactivity.kitchenkonek.databinding.FooddetailscreenBinding


class FoodDetailsActivity : AppCompatActivity() {
    private lateinit var binding: FooddetailscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FooddetailscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val food = intent.getParcelableExtra<Food>("food")
        if (food != null) {
            val textView: TextView = binding.recipeTitle
            val imageView: ImageView = binding.recipeImage

            textView.text = food.name
            imageView.setImageResource(food.image)
            val ingredientsContent: TextView = binding.recipeIngredients
            val procedureContent: TextView = binding.recipeProcedure
            val descriptionContent: TextView = binding.recipeDescription

            setFoodDetails(food.name, italianFood, italianFoodIngredients, italianFoodProcedure, italianFoodDescription, ingredientsContent, procedureContent, descriptionContent)
            setFoodDetails(food.name, filipinoFood, filipinoFoodIngredients, filipinoFoodProcedure, filipinoFoodDescription,ingredientsContent, procedureContent,descriptionContent)
            setFoodDetails(food.name, koreanFood, koreanFoodIngredients, koreanFoodProcedure, koreanFoodDescription, ingredientsContent, procedureContent, descriptionContent)
            setFoodDetails(food.name, breakfastFood, breakfastFoodIngredients, breakfastFoodProcedure, breakfastFoodDescription, ingredientsContent, procedureContent, descriptionContent)
            setFoodDetails(food.name, lunchFood, lunchFoodIngredients, lunchFoodProcedure, lunchFoodDescription, ingredientsContent, procedureContent, descriptionContent)
            setFoodDetails(food.name, dinnerFood, dinnerFoodIngredients, dinnerFoodProcedure, dinnerFoodDescription, ingredientsContent, procedureContent, descriptionContent)



        }


    }
    fun setFoodDetails(foodName: String, foodNames: Array<String>, foodIngredients: Array<String>, foodProcedures: Array<String>, foodDescriptions: Array<String>, ingredientsContent: TextView, procedureContent: TextView, descriptionContent: TextView) {
        for (i in foodNames.indices) {
            if (foodName == foodNames[i]) {
                ingredientsContent.text = foodIngredients[i]
                procedureContent.text = foodProcedures[i]
                descriptionContent.text = foodDescriptions[i]
                break
            }
        }
    }


    //italian category
    val italianFood: Array<String> =
        arrayOf("Spaghetti Aglio E Olla", "Pasta Carbonara", "Margherita Pizza", "Pesto Pasta", "Risotto")
    val italianFoodDescription: Array<String> = arrayOf(
        "Spaghetti aglio e olio (Italian for 'spaghetti [with] garlic and oil'; Italian: [spaˈɡetti ˈaʎʎo e ˈɔːljo]) is a traditional Italian pasta dish from Naples. It is a typical dish of Neapolitan cuisine and is widely popular. Its popularity can be attributed to it being simple to prepare and the fact that it makes use of inexpensive, readily available ingredients that have long shelf lives in a pantry.",
        "There may be no more beloved Italian dish than carbonara: hot pasta tossed with a creamy sauce of raw beaten eggs, accentuated with crisp bits of guanciale, and finished with a shower of grated aged Pecorino Romano cheese plus freshly ground black pepper.",
        "Margherita pizza is known for its ingredients representing the colours of the Italian flag. These ingredients include red tomato sauce, white mozzarella and fresh green basil. When all of these delicious flavours are combined on a hand-kneaded pizza base, a universally-adored pizza is created.",
        "Pesto is one of the most popular pasta toppings in Italy. It originated in Liguria, specifically in Genoa. This flavorful sauce is made of basil, extra-virgin olive oil, parmesan cheese, pecorino cheese, pine nuts, garlic and salt, traditionally ground in a ceramic or marble mortar. It can be homemade or commercially prepared. ",
        "Making risotto at home may seem like a daunting task, but our recipe breaks the process down into simple steps for a foolproof result. Aromatics like shallots, garlic, and thyme build layers of flavor, while gradually adding hot stock as you stir helps coax the starches out of the arborio rice for the creamiest risotto. We love incorporating mushrooms for added flavor, but feel free to make the dish without—or swap in your favorite vegetable! Savory and rich, risotto will make the perfect centerpiece dish for your next dinner party."
    )
    val italianFoodIngredients: Array<String> = arrayOf(
        "1 pound uncooked spaghetti\n" +
                "\n" +
                "½ cup olive oil\n" +
                "\n" +
                "6 cloves garlic, thinly sliced\n" +
                "\n" +
                "¼ teaspoon red pepper flakes, or to taste\n" +
                "\n" +
                "salt and freshly ground black pepper to taste\n" +
                "\n" +
                "¼ cup chopped fresh Italian parsley\n" +
                "\n" +
                "1 cup finely grated Parmigiano-Reggiano cheese",

        "1 tablespoon extra virgin olive oil or unsalted butter\n\n" +
                "1/2 pound pancetta or thick cut bacon, diced\n\n" +
                "1 to 2 garlic cloves, minced, about 1 teaspoon (optional)\n\n" +
                "3 to 4 whole eggs\n\n" +
                "1 cup grated Parmesan or pecorino cheese\n\n" +
                "1 pound spaghetti (or bucatini or fettuccine)\n\n" +
                "Kosher salt and freshly ground black pepper to taste",
        "1 batch easy whole wheat pizza dough or 1 pound store-bought pizza dough\n\n" +
                "1 large can (28 ounces) whole San Marzano tomatoes\n\n" +
                "12 ounces (dry weight) ovoline-type mozzarella or other fresh mozzarella balls, ideally water-packed\n" +
                "Handful of fresh basil, thinly sliced plus small leaves\n\n" +
                "Additional garnishes: Drizzle of extra-virgin olive oil, flaky sea salt or kosher salt and optional red pepper flakes",
        "200 gram penne pasta (approx 2 Cups)\n\n" +
                "6 Cup water\n\n" +
                "1 tablespoon salt\n\n" +
                "2 Cup fresh basil leaves\n\n" +
                "½ Cup walnuts\n\n" +
                "¼ Cup grated parmesan cheese\n\n" +
                "¼ Cup extra virgin olive oil\n\n" +
                "4 – 6 garlic cloves\n\n" +
                "Salt and pepper to taste",
        "6 cups low-sodium chicken stock, or vegetable stock\n\n" +
                "2 tablespoons olive oil\n\n" +
                "1 shallot, finely chopped\n\n" +
                "1 lb shiitake mushroom(455 g), stemmed and thinly sliced\n\n" +
                "2 tablespoons unsalted butter\n\n" +
                "2 cloves garlic, minced\n\n" +
                "1 teaspoon finely chopped fresh thyme leaves\n\n" +
                "kosher salt, to taste\n\n" +
                "freshly ground black pepper, to taste\n\n" +
                "1 ½ cups arborio rice(200 g)\n\n" +
                "½ cup white wine(120 mL), or lemon juice\n\n" +
                "1 cup grated parmesan cheese(110 g), plus more for serving\n\n" +
                "¼ cup fresh parsley(10 g), for serving"
    )

    val italianFoodProcedure: Array<String> =
        arrayOf(
            "Step 1: Bring a large pot of lightly salted water to a boil. Cook spaghetti in the boiling water, stirring occasionally until cooked through but firm to the bite, about 10 to 12 minutes. Drain and transfer to a pasta bowl.\n" +
                    "\n" +
                    "Step 2: While the pasta is cooking, combine olive oil and garlic in a cold skillet. Cook over medium heat to slowly toast garlic, about 10 minutes. Reduce heat to medium-low when olive oil begins to bubble. Cook and stir until garlic is golden brown, about another 5 minutes. Remove from heat.\n" +
                    "\n" +
                    "Step 3: Stir red pepper flakes, salt, and black pepper into pasta. Pour in hot olive oil and garlic, and sprinkle on Italian parsley and half of the Parmigiano-Reggiano cheese; toss until combined.\n" +
                    "\n" +
                    "Step 4: Serve pasta topped with the remaining Parmigiano-Reggiano cheese.",
            "Step 1: Place a large pot of lightly salted water (no more than 1 tablespoon salt) over high heat, and bring to a boil. Fill a large bowl with hot water for serving, and set aside.\n" +
                    "\n" +
                    "Step 2: In a mixing bowl, whisk together the eggs, yolks and pecorino and Parmesan. Season with a pinch of salt and generous black pepper.\n" +
                    "\n" +
                    "Step 3: Set the water to boil. Meanwhile, heat oil in a large skillet over medium heat, add the pork, and sauté until the fat just renders, on the edge of crispness but not hard. Remove from heat and set aside.\n" +
                    "\n" +
                    "Step 4: Add pasta to the water and boil until a bit firmer than al dente. Just before pasta is ready, reheat guanciale in skillet, if needed. Reserve 1 cup of pasta water, then drain pasta and add to the skillet over low heat. Stir for a minute or so.\n" +
                    "\n" +
                    "Step 5: Empty serving bowl of hot water. Dry it and add hot pasta mixture. Stir in cheese mixture, adding some reserved pasta water if needed for creaminess. Serve immediately, dressing it with a bit of additional grated pecorino and pepper.",
            "Step 1: Preheat the oven to 500 degrees Fahrenheit with a rack in the upper third of the oven. If you’re using a baking stone or baking steel, place it on the upper rack. Prepare dough through step 5.\n\n" +
                    "Step 2: Place a medium mixing bowl in the sink and pour the canned tomatoes into the bowl, juices and all. Crush the tomatoes by hand. Spread about ¾ cup of the tomato sauce evenly over each pizza, leaving about 1 inch bare around the edges.\n\n" +
                    "Step 3: If your mozzarella is packed in water, drain off the water and gently pat the mozzarella dry on a clean tea towel or paper towels. If you’re working with large mozzarella balls, tear them into smaller 1-inch balls. Distribute the mozzarella over the pizza, concentrating it a bit more in the center of the pizza, as it will melt toward the edges.\n\n" +
                    "Step 4: Bake pizzas individually on the top rack until the crust is golden and the cheese is just turning golden, about 10 to 12 minutes (or significantly less, if you’re using a baking stone/steel—keep an eye on it).\n\n" +
                    "Step 5: Top each pizza generously with fresh basil, followed by a light back-and-forth drizzle of olive oil, a sprinkling of salt, and red pepper flakes, if you wish. Slice and enjoy. Leftover pizza will keep well in the refrigerator for up to 4 days.",

            "Step 1: Cook spaghetti in salted water to al dente according to package directions. Before draining be sure to reserve the 1/2 cup pasta water.\n\n" +
                    "Step 2: To a 7-cup food processor add basil leaves, parmesan, pine nuts and garlic. Cover with lid and pulse in short bursts until finely minced.\n\n" +
                    "Step 3: Scrape down food processor. Cover, then with food processor running pour olive oil in through the feed tube of the lid. Don't over-process, just blend.\n\n" +
                    "Step 4: Season with salt to taste.\n\n" +
                    "Step 5: Drain pasta once al dente then add to a large serving bowl. Pour in 1/4 cup pasta water and toss. Let it cool 1 - 2 minutes.\n\n" +
                    "Step 6Add all of the pesto and toss. Thin with up to 1/4 cup more pasta water as desired and garnish with more parmesan and pine nuts if desired." ,
            "Step 1: Add the stock to a medium pot and bring to a boil over high heat. Once the stock is boiling, reduce the heat to low or remove the pan from the heat and keep nearby.\n" +
                    "\n" +
                    "Step 2: Heat the olive oil in a wide, tall pot over medium heat. Once the oil begins to shimmer, add the shallot and cook, stirring frequently, until translucent.\n" +
                    "\n" +
                    "Step 3: Add the shiitake mushrooms and butter. Cook, stirring occasionally, until the mushrooms have cooked down and browned.\n" +
                    "\n" +
                    "Step 4: Add the garlic, thyme, salt, and pepper, stir, and cook for 1 minute, until the garlic is fragrant.\n" +
                    "\n" +
                    "Step 5: Add the rice and stir until fully coated in the mushroom mixture. Let the rice toast for 1-2 minutes, until aromatic.\n" +
                    "\n" +
                    "Step 6: Add the white wine and cook until evaporated, stirring occasionally.\n" +
                    "\n" +
                    "Step 7: Add 1 cup (240 ml) of the hot stock and stir to combine. Cook, stirring frequently, until the stock is fully absorbed by the rice.\n" +
                    "\n" +
                    "Step 8: Continue to add the stock, ½ cup (120 ml) at a time, stirring continuously, until fully absorbed, 15-20 minutes. Depending on how fast the rice cooks, there may be leftover stock.\n" +
                    "\n" +
                    "Step 9: Once the rice is al dente, remove from the heat. Add the Parmesan and stir to combine.\n" +
                    "\n" +
                    "Step 10: Garnish the risotto with parsley, Parmesan, salt, and pepper.\n" +
                    "\n" +
                    "Step 11: Enjoy!"
        )

    //filipino food

    val filipinoFood: Array<String> = arrayOf("Adobong Manok", "Sinigang na Baboy", "Kare Kare", "Chopsuey")

    val filipinoFoodDescription: Array<String> = arrayOf("Chicken adobo, also known as adobong manok, is a quintessential filipino braised chicken, marinated and stewed with vinegar, soy sauce, garlic, bay leaves, black peppercorns. The word adobo actually came from the spanish word adobar, meaning to marinate or pickle."

        , "Sinigang na baboy (pork sinigang) is an all-time favorite Filipino dish of pork cooked in a sour soup of tamarind. Made, usually, with a lot of vegetables, so it is also very nutritious. " +
        " A bowl of hot Sinigang na Baboy" +
                " Sinigang has been and always will be a mainstay dish of the everyday Filipino dining throughout the country. A comfort-food to a lot of people. Its lip-smacking sourness will surely wake up your tastebuds and delight your palate."

        , "Kare Kare is a traditional Filipino stew complimented with a thick savory peanut sauce. The commonly used meats for this dish are ox tail, tripe, and pork leg; on some occasions goat and chicken meat are also used. Besides the peanuts, this dish depends on the shrimp paste (on the side) in order to be fully enjoyed. Traditionally, “palayok” (clay cooking pot) is used to cook this dish and it is also used as the serving pot.",

        "Chop Suey is a stir-fried vegetable dish that is cooked with meats such as chicken and pork. Shrimp and seafood can also be added. This chop suey recipe is special because it has almost every ingredient present. Chicken, pork, shrimp, and boiled quail eggs were all included in the recipe, along with fresh veggies. ")

    val filipinoFoodIngredients: Array<String> = arrayOf("Chicken, cut into serving pieces -- 2 1/2 to 3 pound\n" +
            "White vinegar -- 3/4 cup\n\n" +
            "Soy sauce -- 1/4 cup\n\n" +
            "Onion, thinly sliced -- 1/2\n\n" +
            "Garlic, crushed -- 4 to 6 cloves\n\n" +
            "Bay leaf -- 1-2\n\n" +
            "Peppercorns -- 6 to 8\n\n" +
            "Salt -- 1 teaspoon\n\n" +
            "Water -- 1 cup\n\n" +
            "Oil -- 1/4 cup",

        "2 lbs. pork belly sliced into cubes\n\n" +
                "2 to 3 cups kangkong leaves\n\n" +
                "3 pieces long green chili pepper siling pansigang\n\n" +
                "2 pieces tomato quartered\n\n" +
                "1 cup sliced daikon radish labanos\n" +
                "10 to 12 pieces snake beans cut in 2 inch length pieces\n\n" +
                "1 piece onion quartered\n\n" +
                "15 pieces okra\n\n" +
                "2 pieces taro peeled and cut in half (gabi)\n\n" +
                "8 cups water\n\n" +
                "2 packs Knorr Sinigang sa Sampaloc Mix Original (20 gram pack)\n\n" +
                "3 tablespoons fish sauce patis\n\n" +
                "¼ teaspoon ground black pepper"

        , "3 lbs oxtail cut in 2 inch slices you an also use tripe or beef slices\n" +
                "\n1 piece small banana flower bud sliced\n" +
                "\n1 bundle pechay or bok choy\n" +
                "\n1 bundle string beans cut into 2 inch slices\n" +
                "\n4 pieces eggplants sliced\n" +
                "\n1 cup ground peanuts\n" +
                "\n1/2 cup peanut butter\n" +
                "\n1/2 cup shrimp paste\n" +
                "\n34 Ounces water about 1 Liter\n" +
                "\n1/2 cup annatto seeds soaked in a cup of water\n" +
                "\n1/2 cup toasted ground rice\n" +
                "\n1 tbsp garlic minced\n" +
                "\n1 piece onion chopped\n" +
                "\nsalt and pepper",

        "7 pieces shrimp cleaned and deveined\n" +
                "\n3 ounces pork sliced\n" +
                "\n3 ounces boneless chicken breast sliced\n" +
                "\n1 ½ cup cauliflower florets\n" +
                "\n1 piece carrot sliced crosswise into thin pieces\n" +
                "\n15 pieces snow peas\n" +
                "\n8 pieces baby corn\n" +
                "\n1 piece red bell pepper sliced into squares\n" +
                "\n1 piece green bell pepper sliced into squares\n" +
                "\n1 ½ cups cabbage chopped\n" +
                "\n12 pieces quail eggs boiled\n" +
                "\n1 piece yellow onion sliced\n" +
                "\n4 cloves garlic crushed\n" +
                "\n¼ cup soy sauce\n" +
                "\n1 ½ tablespoons oyster sauce\n" +
                "\n¾ cup water\n" +
                "\n1 tablespoon cornstarch diluted in ½ cup water\n" +
                "\n¼ teaspoon ground black pepper\n" +
                "\n3 tablespoons cooking oil")

    val filipinoFoodProcedure: Array<String> = arrayOf("Step 1: Add the chicken pieces, vinegar, soy sauce, onion, garlic, bay leaf, peppercorns and salt to a large, non-reactive bowl and refrigerate for anywhere from one to four hours to marinate.\n" +
            "\nStep 2: Place the chicken and its marinade in a large pot. Add the water and bring to a boil over medium-high heat. Reduce heat to low and simmer for 30 to 45 minutes, or until the chicken is cooked through and tender. Add water as necessary to keep the chicken from drying out.\n" +
            "\nStep 3: Remove the chicken from its sauce, reserving the sauce, and pat dry. Heat the oil in a skillet over medium-high flame and saute the chicken pieces to brown them. Remove from heat and set aside.\n" +
            "\nStep 4: Bring the remaining sauce to a boil over medium flame and cook until somewhat reduced and thickened.\n" +
            "Step 5: Toss the browned chicken pieces with the reduced sauce and serve with rice.",

        "Step 1: Place pork ribs in a large pot. Pour water and bring to a rolling boil over high heat. Use a slotted spoon to skim off the scum that floats to the surface.\n" +
                "\nStep 2: Add the red onion, tomatoes and fish sauce. Once it starts to boil again, cover the pot with the lid and lower the temperature to low. Let it simmer until pork becomes tender.\n" +
                "\n" +
                "Step 3: Add the taro and cover and simmer again for 5 minutes.\n" +
                "\n" +
                "Step 4: Toss in the string beans and radish and let it cook for 2 minutes\n" +
                "\n" +
                "Step 5: Add the okra, eggplant, finger chili, and the kangkong stalks.\n" +
                "\n" +
                "Step 6: Add the tamarind paste and mix until dissolved. Season with salt if needed.\n" +
                "\n" +
                "Step 7: Before all the vegetables are done, toss in the kangkong leaves. Turn off the heat and let the vegetables finish cooking from the residual heat.\n" +
                "\n" +
                "Step 8: Serve in bowls with plain steamed rice and fish sauce with some of the finger chili squashed into it as a dip."


        ,
                "Step 1: In a large pot, bring the water to a boil\n" +
                "\n" +
                        "Step 2: Put in the oxtail followed by the onions and simmer for 2.5 to 3 hrs or until tender (35 minutes if using a pressure cooker)\n" +
                "\n" +
                        "Step 3: Once the meat is tender, add the ground peanuts, peanut butter, and coloring (water from the annatto seed mixture) and simmer for 5 to 7 minutes\n" +
                "\n" +
                        "Step 4: Add the toasted ground rice and simmer for 5 minutes\n" +
                "\n" +
                        "Step 5: On a separate pan, saute the garlic then add the banana flower, eggplant, and string beans and cook for 5 minutes\n" +
                "\n" +
                        "Step 6: Transfer the cooked vegetables to the large pot (where the rest of the ingredients are)\n" +
                "\n" +
                        "Step 7: Add salt and pepper to taste\n" +
                "\n" +
                        "Step 8: Serve hot with shrimp paste. Enjoy!",

        "Step 1: Heat oil in a wok or pan.\n" +
                "\n" +
                "Step 2: Pan fry the shrimp for 1 minute per side. Remove from the wok. Set aside.\n" +
                "\n" +
                "Step 3: Saute onion. Add garlic and continue to saute until the onion becomes soft.\n" +
                "\n" +
                "Step 4: Add pork and chicken. Stir fry until light brown.\n" +
                "\n" +
                "Step 5: Add soy sauce and oyster sauce. Stir.\n" +
                "\n" +
                "Step 6: Pour water. Let boil. Cover and cook in medium heat for 15 minutes.\n" +
                "\n" +
                "Step 7: Add cauliflower, carrots, bell peppers, snow peas, and young corn. Stir.\n" +
                "\n" +
                "Step 8: Add cabbage. Toss. Cover and cook for 5 to 7 minutes.\n" +
                "\n" +
                "Step 9: Put the pan-fried shrimp into the pot and add ground black pepper.\n" +
                "\n" +
                "Step 10: Add the boiled quail eggs and cornstarch diluted in water. Toss.\n" +
                "\n" +
                "Step 11: Transfer to a serving plate. Serve.\n" +
                "\n" +
                "Step 12: Share and enjoy!")


    val koreanFood: Array<String> = arrayOf("Bibimbap", "Kimchi", "Bulgogi", "Japchae")

    val koreanFoodDescription: Array<String> = arrayOf("Bibimbap is a signature Korean dish that translates to 'mixed rice'. It consists of a bowl of warm rice topped with seasoned vegetables, sliced meat, and a fried egg, all of which are mixed together with a spicy gochujang sauce before eating. Bibimbap is often served in a hot stone bowl, known as dolsot bibimbap, which crisps the rice and adds texture to the dish. It is a popular Korean comfort food that can be customized to suit different tastes.",

        "Kimchi is a traditional Korean side dish made of fermented vegetables, typically Napa cabbage, and seasoned with a spicy blend of chili peppers, garlic, ginger, and fish sauce. The fermentation process gives kimchi its distinctive sour and umami flavors, as well as a host of health benefits. Kimchi can be eaten on its own as a side dish or used as an ingredient in other dishes such as soups, stews, and fried rice.",

        "Bulgogi is a Korean barbecue dish made of thinly sliced beef that has been marinated in a sweet and savory sauce made with soy sauce, sugar, garlic, and sesame oil. The beef is typically grilled or pan-fried and served with rice and a variety of side dishes, such as kimchi and pickled vegetables. Bulgogi is a popular Korean dish that is enjoyed by people of all ages and is often served at special occasions such as weddings and family gatherings.",

        "Japchae is a Korean noodle dish made of sweet potato glass noodles, stir-fried with vegetables and meat, typically beef or pork, and seasoned with soy sauce and sesame oil. The dish often includes a variety of colorful vegetables such as carrots, spinach, and bell peppers, as well as mushrooms and onions. Japchae is a popular Korean dish that is often served as a side dish or a main course.")

    val koreanFoodIngredients: Array<String> = arrayOf("1 cup short-grain white rice\n" +
            "\n" +
            "1 1/4 cups water\n" +
            "\n" +
            "1/4 teaspoon salt\n" +
            "\n" +
            "4 ounces ground beef or beef strips\n" +
            "\n" +
            "1 tablespoon soy sauce\n" +
            "\n" +
            "1 tablespoon sesame oil\n" +
            "\n" +
            "1 teaspoon sugar\n" +
            "\n" +
            "1/4 teaspoon black pepper\n" +
            "\n" +
            "1 tablespoon vegetable oil\n" +
            "\n" +
            "1 garlic clove, minced\n" +
            "\n" +
            "1/2 cup julienned carrots\n" +
            "\n" +
            "1/2 cup julienned zucchini\n" +
            "\n" +
            "1/2 cup sliced mushrooms\n" +
            "\n" +
            "1/2 cup spinach leaves\n" +
            "\n" +
            "1/2 cup bean sprouts\n" +
            "\n" +
            "1 egg, fried or poached\n" +
            "\n" +
            "1 tablespoon gochujang (Korean red pepper paste)\n" +
            "\n" +
            "Process finished with exit code 0\n",

        "1 head Napa cabbage\n" +
                "\n" +
                "1/4 cup salt\n" +
                "\n" +
                "3 tablespoons Korean chili flakes\n" +
                "\n" +
                "1 tablespoon sugar\n" +
                "\n" +
                "2 cloves garlic, minced\n" +
                "\n" +
                "1 teaspoon ginger, grated\n" +
                "\n" +
                "3 green onions, sliced\n" +
                "\n" +
                "1/4 cup fish sauce\n" +
                "\n" +
                "1/4 cup water\n" +
                "\n" +
                "1/4 cup Korean radish, julienned",

        "1 pound beef sirloin, sliced thinly\n" +
                "\n" +
                "1/2 cup soy sauce\n" +
                "\n" +
                "1/4 cup brown sugar\n" +
                "\n" +
                "1/4 cup sesame oil\n" +
                "\n" +
                "3 cloves garlic, minced\n" +
                "\n" +
                "1/2 teaspoon black pepper\n" +
                "\n" +
                "1/2 onion, sliced\n" +
                "\n" +
                "1 green onion, chopped\n" +
                "\n" +
                "1 tablespoon sesame seeds"

        ,"8 oz sweet potato glass noodles\n" +
                "\n" +
                "1/2 pound beef sirloin, sliced thinly\n" +
                "\n" +
                "2 tablespoons soy sauce\n" +
                "\n" +
                "2 tablespoons sugar\n" +
                "\n" +
                "2 tablespoons sesame oil\n" +
                "\n" +
                "1 tablespoon vegetable oil\n" +
                "\n" +
                "1 onion, sliced\n" +
                "\n" +
                "2 garlic cloves, minced\n" +
                "\n" +
                "4-5 shiitake mushrooms, sliced\n" +
                "\n" +
                "1/2 red bell pepper, sliced\n" +
                "\n" +
                "1/2 yellow bell pepper, sliced\n" +
                "\n" +
                "1/2 green bell pepper, sliced\n" +
                "\n" +
                "2 scallions, sliced\n" +
                "\n" +
                "1 carrot, julienned\n" +
                "\n" +
                "1 cup spinach leaves, blanched and drained\n" +
                "\n" +
                "1 tablespoon sesame seeds\n" +
                "\n" +
                "Process finished with exit code 0\n")

    val koreanFoodProcedure: Array<String> = arrayOf(
        "Step 1: Rinse the rice in cold water and drain. Add it to a medium saucepan with the water and salt. Bring to a boil, reduce the heat to low, cover, and simmer for 18 minutes.\n" +
                "\nStep 2:  In a bowl, mix the ground beef with the soy sauce, sesame oil, sugar, and black pepper. Set aside.\n" +
                "\nStep 3: Heat the vegetable oil in a large skillet over medium-high heat. Add the garlic and stir for 30 seconds.\n" +
                "\nStep 4: Add the beef mixture and cook until browned, stirring occasionally, about 5 minutes.\n" +
                "\nStep 5: Add the carrots, zucchini, and mushrooms to the skillet and stir-fry for 2-3 minutes, until the vegetables are slightly softened.\n" +
                "\n Step 6: Add the spinach and bean sprouts and stir-fry for another minute.\n" +
                "\n Step 7: Remove the skillet from the heat and stir in the gochujang sauce.\n" +
                "\nStep 8: Divide the rice between 4 bowls. Top each bowl with the beef and vegetable mixture, a fried or poached egg, and additional gochujang sauce to taste. Serve immediately.",

        "Step 2: Cut the cabbage into quarters and remove the core. Cut each quarter crosswise into 2-inch-wide strips.\n" +
                "\n" +
                "Step 2: In a large bowl, combine the cabbage and salt. Toss to coat evenly.\n" +
                "\n" +
                "Step 3: Let the cabbage sit for 2 hours, tossing occasionally.\n" +
                "\n" +
                "Step 4: Rinse the cabbage in cold water and drain well.\n" +
                "\n" +
                "Step 5: In a large bowl, combine the chili flakes, sugar, garlic, ginger, and green onions. Add the cabbage and toss to coat.\n" +
                "\n" +
                "Step 6: Transfer the mixture to a large glass jar or ceramic crock, pressing down firmly to remove air pockets.\n" +
                "\n" +
                "Step 7: In a small bowl, whisk together the fish sauce, water, and Korean radish. Pour over the cabbage until it is covered.\n" +
                "\n" +
                "Step 8: Cover the jar or crock loosely with a lid or plastic wrap and let it sit at room temperature for 2-5 days, until the kimchi is sour and bubbly.\n" +
                "\n" +
                "Step 9: Transfer the kimchi to a lidded container and refrigerate for up to 1 month.",

        "Step 1: In a bowl, mix the beef with the soy sauce, sugar, garlic, and sesame oil. Cover and refrigerate for at least 30 minutes, or up to 2 hours.\n" +
                "\n" +
                "Step 2: Heat a large skillet or grill pan over high heat. Add the beef and cook, stirring occasionally, until browned and cooked through, about 3-4 minutes.\n" +
                "\n" +
                "Step 3: Serve the beef hot with steamed rice and a variety of Korean side dishes such as kimchi, pickled vegetables, and steamed greens.",

        "Step 1: Cook the sweet potato noodles according to the package instructions. Drain and rinse under cold water. Set aside.\n" +
                "\n" +
                "Step 2: In a bowl, mix the beef with the soy sauce, sugar, garlic, and sesame oil. Cover and refrigerate for at least 30 minutes, or up to 2 hours.\n" +
                "\n" +
                "Step 3: Heat the vegetable oil in a large skillet or wokover high heat. Add the beef and stir-fry for 2-3 minutes, until browned and cooked through.\n" +
                "\n" +
                "Step 4: Push the beef to one side of the skillet and add the onion, carrot, and spinach to the other side. Stir-fry for 2-3 minutes, until the vegetables are slightly softened.\n" +
                "\n" +
                "Step 5: Add the sweet potato noodles and gochujang sauce to the skillet and stir-fry for another minute.\n" +
                "\n" +
                "Step 6: Remove the skillet from the heat and stir in the sesame seeds.\n" +
                "\n" +
                "Step 7: Divide the noodle mixture between 4 bowls. Top each bowl with a fried or poached egg, and garnish with chopped scallions, if desired. Serve immediately.",
                "Step 1: Cut the beef into thin strips.\n" +
                "\n" +
                        "Step 2: In a bowl, mix the beef with the soy sauce, sugar, garlic, and sesame oil. Cover and refrigerate for at least 30 minutes, or up to 2 hours.\n" +
                "\n" +
                        "Step 3: Heat a large skillet or wok over high heat. Add the beef and stir-fry for 2-3 minutes, until browned and cooked through.\n" +
                "\n" +
                        "Step 4: Push the beef to one side of the skillet and add the onion and bell pepper to the other side. Stir-fry for 2-3 minutes, until the vegetables are slightly softened.\n" +
                "\n" +
                        "Step 5: Add the zucchini and mushrooms to the skillet and stir-fry for another minute.\n" +
                "\n" +
                        "Step 6: Remove the skillet from the heat and stir in the sesame seeds.\n" +
                "\n" +
                        "Step 7: Divide the beef and vegetable mixture between 4 bowls. Top each bowl with a fried or poached egg, and garnish with chopped scallions, if desired. Serve immediately.",

        "Step 1: Rinse the rice in cold water and drain. Add it to a medium saucepan with the water and salt. Bring to a boil, reduce the heat to low, cover, and simmer for 18 minutes.\n" +
                "\n" +
                "Step 2: In a large skillet or wok, heat the vegetable oil over medium-high heat. Add the garlic and stir for 30 seconds.\n" +
                "\n" +
                "Step 3: Add the shrimp and stir-fry for 2-3 minutes, until pink and cooked through. Remove from the skillet and set aside.\n" +
                "\n" +
                "Step 4: Add the onion and bell pepper to the skillet and stir-fry for 2-3 minutes, until the vegetables are slightly softened.\n" +
                "\n" +
                "Step 5: Add the zucchini and mushrooms to the skillet and stir-fry for another minute.\n" +
                "\n" +
                "Step 6: Return the shrimp to the skillet and stir in the gochujang sauce.\n" +
                "\n" +
                "Step 7: Remove the skillet from the heat and stir in the sesame seeds.\n" +
                "\n" +
                "Step 8: Divide the rice between 4 bowls. Top each bowl with the shrimp and vegetable mixture, and garnish with chopped scallions, if desired. Serve immediately.",

        "Step 1: Cook the sweet potato noodles according to the package instructions. Drain and rinse under cold water. Set aside.\n" +
                "\n" +
                "Step 2: In a bowl, mix the shrimp with the soy sauce, sugar, garlic, and sesame oil. Cover and refrigerate for at least 30 minutes, or up to 2 hours.\n" +
                "\n" +
                "Step 3: Heat the vegetable oil in a large skillet or wok over high heat. Add the shrimp and stir-fry for 2-3 minutes, until pink and cooked through.\n" +
                "\n" +
                "Step 4: Remove the shrimp from the skillet and set aside. Add the onion and bell pepper to the skillet and stir-fry for 2-3 minutes, until the vegetables are slightly softened.\n" +
                "\n" +
                "Step 5: Add the zucchini and mushrooms to the skillet and stir-fry for another minute.\n" +
                "\n" +
                "Step 6: Return the shrimp to the skillet and stir in the cooked sweet potato noodles and gochujang sauce.\n" +
                "\n" +
                "Step 7: Remove the skillet from the heat and stir in the sesame seeds.\n" +
                "\n" +
                "Step 8: Divide the shrimp and noodle mixture between 4 bowls. Top each bowl with a fried or poached egg, and garnish with chopped scallions, if desired. Serve immediately.")


    // breakfast food
    val breakfastFood: Array<String> = arrayOf("Eggs Benedict", "Buttermilk Pancakes", "French Toast", "Breakfast Burrito")

    val breakfastFoodDescription: Array<String> = arrayOf("Eggs Benedict is a classic breakfast dish that consists of two halves of an English muffin, each of which is topped with a slice of Canadian bacon, a poached egg, and hollandaise sauce.",
        "Buttermilk pancakes are a fluffy and delicious breakfast staple. They're made with buttermilk, which gives them a tangy flavor and helps to make them light and fluffy.",
        "French toast is a classic breakfast dish made with bread that has been soaked in a mixture of eggs, milk, and cinnamon, and then fried until golden brown. It's often served with maple syrup and powdered sugar.",
        "A breakfast burrito is a popular breakfast dish that consists of a tortilla filled with scrambled eggs, cheese, and a variety of other ingredients such as bacon, sausage, potatoes, and vegetables. It's a hearty and filling breakfast option.")

    val breakfastFoodIngredients: Array<String> = arrayOf("English muffins, split and toasted -- 2\n" +
            "\n" +
            "Canadian bacon -- 4 slices\n" +
            "\n" +
            "Eggs -- 4\n" +
            "\n" +
            "White vinegar -- 1 tablespoon\n" +
            "\n" +
            "Butter -- 1/2 cup\n" +
            "\n" +
            "Egg yolks -- 4\n" +
            "\n" +
            "Lemon juice -- 1 tablespoon\n" +
            "\n" +
            "Salt -- 1/4 teaspoon\n" +
            "\n" +
            "Cayenne pepper -- dash",
        "All-purpose flour -- 1 1/2 cups\n\n" +
                "Baking powder -- 3 1/2 teaspoons\n\n" +
                "Salt -- 1 teaspoon\n\n" +
                "Sugar -- 1 tablespoon\n\n" +
                "Buttermilk -- 1 1/4 cups\n\n" +
                "Egg -- 1\n\n" +
                "Butter, melted -- 3 tablespoons",
        "Bread slices -- 8\n\n" +
                "Eggs -- 4\n\n" +
                "Milk -- 1 cup\n" +
                "Cinnamon -- 1 teaspoon\n\n" +
                "Butter -- 4 tablespoons\n\n" +
                "Maple syrup -- for serving",
        "Tortillas -- 4\n\n" +
                "Eggs -- 6\n\n" +
                "Milk -- 1/4 cup\n\n" +
                "Salt -- 1/4 teaspoon\n\n" +
                "Pepper -- 1/4 teaspoon\n\n" +
                "Butter -- 2 tablespoons\n\n" +
                "Cheddar cheese, shredded -- 1 cup\n\n" +
                "Bacon, cooked and crumbled -- 8 slices\n\n" +
                "Green onions, chopped -- 2\n\n" +
                "Salsa -- 1/2 cup")

    val breakfastFoodProcedure: Array<String> = arrayOf("Step 1: Fill a saucepan with a few inches of water and bring it to a simmer over medium heat. While the water heats up, prepare the other ingredients.\n" +
            "\n" +
            "Step 2: Toast the English muffin halves until lightly browned. Top each half with a slice of Canadian bacon.\n" +
            "\n" +
            "Step 3: Crack an egg into a small bowl or cup. When the water is simmering, add the vinegar and stir to create a vortex in the center of the pan. Carefully pour the egg into the vortex and cook for 3-4 minutes, or until the white is set but the yolk is still runny. Remove the egg with a slotted spoon and place it on top of one of the Canadian bacon-topped English muffin halves. Repeat with the remaining eggs.\n" +
            "\n" +
            "Step 4: In a small saucepan, melt the butter over low heat. In a blender or food processor, combine the egg yolks, lemon juice, salt, and cayenne pepper. Blend until smooth.\n" +
            "\n" +
            "Step 5: With the blender or food processor running, slowly pour the melted butter into the egg yolk mixture in a thin stream. Continue blending until the sauce is thick and creamy.\n" +
            "\n" +
            "Step 6: Spoon the hollandaise sauce over the poached eggs and serve immediately.",
        "Step 1: In a large bowl, whisk together the flour, baking powder, salt, and sugar.\n" +
                "\n" +
                "Step 2: In a separate bowl, whisk together the buttermilk, egg, and melted butter.\n" +
                "\n" +
                "Step 3: Add the wet ingredients to the dry ingredients and stir until just combined.\n" +
                "\n" +
                "Step 4: Heat a large skillet or griddle over medium-high heat. Grease the skillet or griddle with butter or cooking spray.\n" +
                "\n" +
                "Step 5: Use a 1/4-cup measure to scoop the pancake batter onto the skillet or griddle. Cook the pancakes for 2-3 minutes on each side, or until golden brown.\n" +
                "\n" +
                "Step 6: Serve the pancakes hot, with butter and syrup if desired.",
        "Step 1: In a shallow dish, whisk together the eggs, milk, and cinnamon.\n" +
                "\n" +
                "Step 2: Heat a large skillet over medium-high heat. Melt 1 tablespoon of butter in the skillet.\n" +
                "\n" +
                "Step 3: Dip a slice of bread into the egg mixture, making sure to coat both sides evenly.\n" +
                "\n" +
                "Step 4: Place the bread in the skillet and cook for 2-3 minutes on each side, or until golden brown. Repeat with the remaining bread slices, adding more butter to the skillet as needed.\n" +
                "\n" +
                "Step 5: Serve the French toast hot, with maple syrup and powdered sugar if desired.",
        "Step 1. In a large bowl, whisk together the eggs, milk, salt, and pepper.\n" +
                "\n" +
                "Step 2: In a large skillet, melt the butter over medium-high heat. Add the egg mixture and cook, stirring frequently, until the eggs are scrambled and cooked through.\n" +
                "\n" +
                "Step 3: Warm the tortillas in the microwave or on the stovetop.\n" +
                "\n" +
                "Step 4: Divide the scrambled eggs among the tortillas. Top each with shredded cheese, crumbled bacon, chopped green onions, and salsa.\n" +
                "\n" +
                "Step 5: Roll up the burritos and serve immediately.")
    val lunchFood: Array<String> = arrayOf("Caprese Salad", "BLT Sandwich", "Chicken Caesar Salad", "Grilled Cheese Sandwich")

    val lunchFoodDescription: Array<String> = arrayOf("A simple Italian salad made with fresh mozzarella cheese, ripe tomatoes, and fresh basil leaves. It's often drizzled with olive oil and seasoned with salt and pepper.",
        "A classic sandwich made with crispy bacon, juicy tomatoes, crisp lettuce, and mayonnaise, served on toasted bread.",
        "A hearty salad made with romaine lettuce, grilled chicken breast, croutons, Parmesan cheese, and Caesar dressing.",
        "A classic sandwich made with melted cheese between slices of toasted bread. It can be served plain or with a variety of toppings, such as ham or tomato.")

    val lunchFoodIngredients: Array<String> = arrayOf("Fresh mozzarella cheese -- 8 oz\n\n" +
            "Tomatoes -- 2 large\n\n" +
            "Fresh basil leaves -- 1/4 cup\n\n" +
            "Olive oil -- 2 tbsp\n\n" +
            "Salt and pepper -- to taste",
        "Bacon -- 8 slices\n\n" +
                "Tomatoes -- 2 large\n\n" +
                "Lettuce -- 4 leaves\n\n" +
                "Mayonnaise -- 4 tbsp\n\n" +
                "Bread -- 8 slices, toasted",
        "Romaine lettuce -- 1 head\n\n" +
                "Grilled chicken breast -- 2, sliced\n\n" +
                "Croutons -- 1 cup\n\n" +
                "Parmesan cheese -- 1/2 cup, grated\n\n" +
                "Caesar dressing -- 1/2 cup",
        "Bread -- 4 slices, toasted\n\n" +
                "Cheese -- 4 slices\n\n" +
                "Butter -- 2 tbsp")

    val lunchFoodProcedure: Array<String> = arrayOf("Step 1: Slice the mozzarella cheese and tomatoes into thin slices.\n" +
            "\n" +
            "Step 2: Arrange the cheese and tomato slices on a plate, alternating them with the basil leaves.\n" +
            "\n" +
            "Step 3: Drizzle olive oil over the salad and season with salt and pepper to taste.",
        "Step 1: Cook the bacon in a skillet over medium heat until crispy. Remove from the skillet and drain on paper towels.\n" +
                "\n" +
                "Step 2: Slice the tomatoes and tear the lettuce leaves into bite-sized pieces.\n" +
                "\n" +
                "Step 3: Spread mayonnaise on one side of each slice of bread. Layer the bacon, tomatoes, and lettuce on one slice of bread, then top with the other slice of bread.\n" +
                "\n" +
                "Step 4: Cut the sandwich in half and serve.",
        "Step 1: Wash and dry the lettuce, then tear it into bite-sized pieces.\n" +
                "\n" +
                "Step 2: In a large bowl, combine the lettuce, chicken, croutons, and Parmesan cheese.\n" +
                "\n" +
                "Step 3: Toss the salad with Caesar dressing to coat.",
        "Step 1. Place a slice of cheese between two slices of bread.\n" +
                "\n" +
                "Step 2: Melt the butter in a skillet over medium heat. Place the sandwich in the skillet and cook until the cheese is melted and the bread is golden brown, flipping halfway through.\n" +
                "\n" +
                "Step 3: Cut the sandwich in half and serve.")

    val dinnerFood: Array<String> = arrayOf("Grilled Steak", "Roasted Chicken", "Salmon Fillet", "Vegetable Stir-Fry")

    val dinnerFoodDescription: Array<String> = arrayOf("A juicy steak seasoned with salt and pepper and grilled to perfection.",
        "A whole chicken roasted with herbs and spices until golden brown and tender.",
        "A flaky fillet of salmon baked with lemon and herbs.",
        "A colorful stir-fry made with a variety of fresh vegetables and served over rice.")

    val dinnerFoodIngredients: Array<String> = arrayOf("Steak -- 1 lb\n" +
            "Salt and pepper -- to taste\n\n" +
            "Olive oil -- 2 tbsp",
        "Whole chicken -- 1 (3-4 lbs)\n" +
                "Salt and pepper -- to taste\n\n" +
                "Herbs (such as thyme or rosemary) -- 1-2 sprigs\n\n" +
                "Butter -- 2 tbsp",
        "Salmon fillets -- 4 (6 oz each)\n\n" +
                "Lemon -- 1, sliced\n\n" +
                "Garlic -- 2 cloves, minced\n\n" +
                "Fresh dill -- 1/4 cup, chopped\n\n" +
                "Olive oil -- 2 tbsp",
        "Assorted vegetables (such as bell peppers, broccoli, and carrots) -- 4 cups, chopped\n\n" +
                "Garlic -- 2 cloves, minced\n\n" +
                "Soy sauce -- 1/4 cup\n\n" +
                "Honey -- 2 tbsp\n\n" +
                "Cornstarch -- 1 tbsp\n\n" +
                "Water -- 1/4 cup\n\n" +
                "Rice -- 2 cups, cooked")

    val dinnerFoodProcedure: Array<String> = arrayOf("Step 1: Preheat the grill to medium-high heat.\n" +
            "\n" +
            "Step 2: Season the steak with salt and pepper and brush with olive oil.\n" +
            "\n" +
            "Step 3: Grill the steak for 5-7 minutes per side, or until cooked to your liking.\n" +
            "\n" +
            "Step 4: Let the steak rest for a few minutes before slicing and serving.",
        "Step 1: Preheat the oven to 425°F.\n" +
                "\n" +
                "Step 2: Season the chicken with salt and pepper and place in a roasting pan.\n" +
                "\n" +
                "Step 3: Stuff the cavity of the chicken with herbs and dot with butter.\n" +
                "\n" +
                "Step 4: Roast the chicken for 1-1 1/2 hours, or until the internal temperature reaches 165°F.\n" +
                "\n" +
                "Step 5: Let the chicken rest for 10-15 minutes before carving and serving.",
        "Step 1: Preheat the oven to 400°F.\n" +
                "\n" +
                "Step 2: Season the salmon fillets with salt and pepper and place in a baking dish.\n" +
                "\n" +
                "Step 3: Top each fillet with a few slices of lemon, minced garlic, and chopped dill.\n" +
                "\n" +
                "Step 4: Drizzle with olive oil and bake for 12-15 minutes, or until the salmon flakes easily with a fork.\n" +
                "\n" +
                "Step 5: Serve hot.",
        "Step 1: Heat a wok or large skillet over high heat.\n" +
                "\n" +
                "Step 2: Add the chopped vegetables and minced garlic and stir-fry for 3-5 minutes, or until tender-crisp.\n" +
                "\n" +
                "Step 3: In a small bowl, whisk together the soy sauce, honey, and cornstarch." +
                "\n" +
                "Step 4: Add the soy sauce mixture to the skillet and stir-fry for another 1-2 minutes, or until the sauce thickens.\n" +
        "\n" +
                "Step 5: Serve the stir-fry over cooked rice.")

}