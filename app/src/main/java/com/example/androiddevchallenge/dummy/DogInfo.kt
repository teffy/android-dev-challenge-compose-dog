/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.dummy

data class DogInfo(
    val id: Int,
    val name: String,
    val desc: String,
    val iconUrl: String,
    val imageUrl: String
)

object DogInfoDummy {
    val dogs: List<DogInfo> = listOf<DogInfo>(
        DogInfo(
            0,
            "afador",
            """
            The Afador is a mixed breed dog–a cross between the Afghan Hound and Labrador Retriever dog breeds. Loyal, energetic, and affectionate, these pups inherited some of the best qualities from both of their parents.

            Afadors are also sometimes known as the Afghan Lab. You can find these mixed breed dogs in shelters and breed specific rescues, so remember to always adopt! Don’t shop if you’re looking to add an Afador to your home!

            Afadors make excellent family pets, although they do better with older children and seasoned dog owners who can give the breed the training and attention they require. Afadors also make for good guard dogs, and they’re alert to strangers. The mixed breed is very energetic and athletic, so access to a safe outdoor space is preferred.
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2019/08/afador-mixed-dog-breed-pictures-cover.jpg",
            "https://www.dogtime.com/assets/uploads/2019/08/afador-mixed-dog-breed-pictures-1-1442x1328.jpg"
        ),
        DogInfo(
            1,
            "Affenhuahua",
            """
            The Affenhuahua is a mixed breed dog–a cross between the Chihuahua and Affenpinscher dog breeds. Petite, sassy, and highly energetic, these pups inherited some of the best traits from both of their parents.

Affenhuahuas are also sometimes called Affen Chi. Despite their status as a designer breed, you can find these mixed breed dogs in shelters and rescues, so adopt! Don’t shop!

These compact, cute pups make great apartment dogs for active city dwellers, though they can also thrive in small or single-person households. They can also be a bit territorial and yappy. If you want an energetic, sassy dog who will keep you on your toes, alert you to any dangers, and love you unconditionally, the Affenhuahua may be the right dog for you!

DogTime recommends this carrier for traveling with your small Affenhuahua.  You should also pick up this dog water bottle for any outdoor adventures you have with your pup!
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2020/02/affenhuahua-mixed-dog-breed-pictures-COVER.jpg",
            "https://www.dogtime.com/assets/uploads/2020/02/affenhuahua-mixed-dog-breed-pictures-1-1442x960.jpg"
        ),
        DogInfo(
            2,
            "Affenpinscher",
            """
            Dogs of the Affenpinscher breed were originally created to act as ratters in homes, stables, and shops. Bred down in size, they moved up in the world, becoming ladies’ companions. Today, they are happy, mischievous companion dogs.

Although these are purebred dogs, you may still find them in shelters and rescues. Remember to adopt! Don’t shop if you want to bring a dog home.

Affenpinschers adore their humans, but they prefer the company of adults. They don’t take well to rough play, chasing, or being held on a lap without the freedom to jump down on their own time. But grown-up pet parents will find that these dogs are loving, loyal, and protective despite their small size.
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2011/01/file_23096_affenpinscher-460x290.jpg",
            "https://dogtime.com/assets/uploads/gallery/affenpinscher-dog-breed-pictures/10-floorhappy.jpg"
        ),
        DogInfo(
            3,
            "American Foxhound",
            """
                Easygoing, sweet, kind, and loyal, the American Foxhound dog breed belongs to a way of life that has continued for more than two centuries, but they have the potential to be a modern-day companion as well.

                Although they’re purebred dogs, you may find American Foxhounds in shelters or in the care of rescue groups. If this is the breed for you, opt to adopt if possible!

                The American Foxhound’s stamina and love of running make them great jogging partners for athletic pet parents, and their mild nature makes them excellent family dogs, so long as they get the exercise they crave. Although they’re low maintenance and affectionate pets, apartment dwellers and novice owners should beware. This breed’s energy and intensity mean that they need plenty of space to run and a commitment to lots of active play time.

                DogTime recommends this dog bed to give a good night’s sleep to your medium-sized American Foxhound. You should also pick up this dog water bottle for any outdoor adventures you have with your pup!
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2011/01/file_23006_american-foxhound-460x290.jpg",
            "https://dogtime.com/assets/uploads/gallery/american-foxhound-dog-breed-pictures/4-sidestand.jpg"
        ),
        DogInfo(
            4,
            "Basset Retriever",
            """
                The Basset Retriever is a mixed breed dog–a cross between the Basset Hound and Golden Retriever dog breeds. Friendly, affectionate, and intelligent, these pups inherited some of the best qualities from both of their parents.

                You can find these mixed breed dogs in shelters and breed specific rescues, so remember to always adopt! Don’t shop if you’re looking to add one of these pups to your home!

                The Basset Retriever is a great family dog with a mild-mannered disposition, a willingness to please, and a loving and devoted nature. The mixed breed is extra friendly and gets along well with children, although due their hunting heritage, they will require a high amount of exercise to stay healthy and happy. These dogs do best with active and busy families.
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2019/11/basset-retriever-mixed-dog-breed-pictures-cover.jpg",
            "https://www.dogtime.com/assets/uploads/2019/11/basset-retriever-mixed-dog-breed-pictures-1.jpg"
        ),
        DogInfo(
            5,
            "Bavarian Mountain Scent Hound",
            """
                The Bavarian Mountain Scent Hound is a purebred dog originally from Germany. These pups are loyal, intelligent, and reserved, which are some of the best traits for a Hound dog breed.

                Bavarian Mountain Scent Hounds go by a few other names, including Bavarian Mountain Scenthound and Bayerischer Gebirgsschwei. Despite being a very rare breed, you may find these adorable pooches in local shelters or breed specific rescues. So remember to adopt! Don’t shop!

                These reserved pups are very loyal to their pet parents and would fit great with families with children or larger households. They are a quiet breed but are very wary towards strangers or anyone they don’t know approaching them or their humans. If you want a loyal pup who likes to be active and will love you unconditionally, the Bavarian Mountain Scent Hound may be the right dog for you!
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2019/09/Bavarian-Mountain-Scent-Hound-dog-breed-pictures-cover.jpg",
            "https://dogtime.com/assets/uploads/gallery/bavarian-mountain-scent-hound-dog-breed-pictures/bavarian-mountain-scent-hound-dog-breed-pictures-5.jpg"
        ),
        DogInfo(
            6,
            "Beaglier",
            """
                The Beaglier is a mixed breed dog — a cross between the Beagle and Cavalier King Charles Spaniel dog breeds. Compact, energetic, and loyal, these pups inherited some of the best qualities from both of their parents.

                Beaglier is also spelled Beagalier and Beagelier. Despite their unfortunate status as a designer breed, you may find these pups, in shelters and rescues. So remember to adopt! Don’t shop!

                These adorable pups make great family additions for active singles or families with older children in large homes or small apartments. If you are looking for a pup who has a spirited and fun-loving personality, then this may be your soulmate. Read on to find out if this mixed breed dog is right for you!
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2019/11/beaglier-mixed-dog-breed-pictures-cover.jpg",
            "https://dogtime.com/assets/uploads/gallery/beaglier-mixed-dog-breed-pictures/beaglier-mixed-dog-breed-pictures-6.jpg"
        ),
        DogInfo(
            7,
            "Caucasian Shepherd Dog",
            """
                Loyal, strong, and courageous, the Caucasian Shepherd Dog is a fierce family protector. They were bred to care for flocks and defend the home against wild predators in the rough Caucasus Mountain region. They’re also known as Caucasian Mountain Dogs, Russian Bear Dogs, Baskhan (Karachay) Pariy, Caucasian Ovcharka Dogs, or just CO, and there are many variants and types.

                This massive breed is highly territorial and won’t back down from a fight, even against bears or wolves. Caucasian Shepherd Dogs are intelligent, but their stubborn, independent nature can make them difficult to train. Their natural distrust of strangers and other animals can also lead to aggressive tendencies if an experienced trainer doesn’t keep them in check.

                This breed is not a good choice for novice owners, and though they are fairly low-energy dogs, the sheer size of Caucasian Shepherd Dogs makes them poorly suited for apartment living and homes with small children. Still, with proper training and socialization, Caucasian Shepherd Dogs can make strong watchdogs, family companions, and even therapy dogs.

                While they may not appeal to first-time dog owners, Caucasian Shepherd Dogs will reward experienced, patient, consistent trainers with gentle love and affection that will make them excellent lifelong family members.

                See below for full list of Caucasian Shepherd Dog characteristics!
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2018/01/caucasian-shepherd-dog-breed-pictures-cover-460x261.jpg",
            "https://dogtime.com/assets/uploads/gallery/caucasian-shepherd-dog-breed-pictures/caucasian-shepherd-dog-breed-pictures-1.jpg"
        ),
        DogInfo(
            8,
            "Dorkie",
            """
                The Dorkie is a mixed breed dog — a cross between the Dachshund and Yorkshire Terrier. Laid-back and loyal, these pint-sized pups inherited some of the best qualities from both of their parents.

                Dorkies also go by the names Dorkie Terrier and Doxie Yorkie. Despite their unfortunate status as a designer breed, you can find these mixed breed pups in shelters and breed specific rescues, so remember to adopt! Don’t shop!

                These adorable pups are not overly yappy and would make great companions for seniors living in apartments. While they’re well suited to small or single-person households, they’ll also thrive in larger family environments with older kids, as they demand quite a bit of attention. If you’re a traveler, this pup makes an easy travel companion and would love to tag along, wherever the road leads you.
            """.trimIndent(),
            "https://www.dogtime.com/assets/uploads/2020/01/dorkie-mixed-dog-breed-pictures-cover.jpg",
            "https://dogtime.com/assets/uploads/gallery/dorkie-mixed-dog-breed-pictures/dorkie-mixed-dog-breed-pictures-3.jpg"
        ),
    )

    fun dog(id: Int): DogInfo {
        return dogs[id]
    }
}
