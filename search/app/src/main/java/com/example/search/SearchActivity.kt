package com.example.search

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class SearchActivity : AppCompatActivity(), ClickListener {

    // on below line we are creating variables for
    // our swipe to refresh layout, recycler view,
    // adapter and list.
    lateinit var recyclerView: RecyclerView
    lateinit var itemsAdapter: ItemsAdapter
    lateinit var itemList: ArrayList<ItemsModal>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)



        val homeNavSearch = findViewById<Button>(R.id.home_nav_search)
        homeNavSearch.setOnClickListener {
            startActivity(Intent(this@SearchActivity, MainActivity::class.java))
        }

        val inPersonNavSearch = findViewById<Button>(R.id.in_person_nav_search)
        inPersonNavSearch.setOnClickListener {
            startActivity(Intent(this@SearchActivity, MapsActivity::class.java))
        }


        // on below line we are initializing our views with their ids.
        recyclerView = findViewById(R.id.searchView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // on below line we are initializing our list
        itemList = ArrayList()


        // on below line we are initializing our adapter
        itemsAdapter = ItemsAdapter(itemList, this)


        // on below line we are setting adapter to our recycler view.
        recyclerView.adapter = itemsAdapter


        // on below line we are adding data to our list
        itemList.add(
            ItemsModal(
                "UNICEF",
                "Donate for children in need.",
                "UNICEF (United Nations International Children's Emergency Fund) is a United Nations program that is dedicated to promoting the well-being and rights of children around the world. UNICEF was established in 1946 and operates in over 190 countries and territories.\n\n" +
                        "The organization's mission is to ensure that every child has access to basic healthcare, nutrition, education, and protection from violence, exploitation, and discrimination. UNICEF works to provide emergency relief in times of crisis, such as natural disasters and conflict situations, and also supports long-term development programs that help communities build better futures for their children.\n" +
                        "UNICEF works with governments, civil society organizations, and other partners to advocate for policies and programs that benefit children. The organization also conducts research and data analysis to better understand the needs and challenges facing children around the world.\n\n" +
                        "Some of the key areas of focus for UNICEF include child survival and development, education, child protection, gender equality, and humanitarian action. The organization also prioritizes the most marginalized and vulnerable children, including those affected by poverty, conflict, and displacement.\n\n" +
                        "Overall, UNICEF is committed to ensuring that every child has the opportunity to reach their full potential, and works tirelessly to improve the lives of children around the world.",
                "https://www.unicefusa.org/?form=donate", R.drawable.unicef
            )
        )
        itemList.add(
            ItemsModal(
                "CARE International",
                "Help end poverty and social injustice.",
                "CARE International is a global non-profit organization that is dedicated to fighting poverty and empowering women and girls around the world. The organization was founded in 1945 and operates in over 100 countries, with a focus on the most vulnerable and marginalized communities.\n\n" +
                        "CARE's mission is to improve the lives of those living in poverty by providing access to education, healthcare, clean water, and other essential resources. The organization works to promote sustainable development and economic growth, and advocates for policies that support social justice and gender equality.\n\n" +
                        "CARE's work is guided by a commitment to empowering women and girls, recognizing that they are disproportionately affected by poverty and discrimination. The organization supports women's entrepreneurship and leadership, and works to eliminate gender-based violence and discrimination.\n\n" +
                        "CARE operates a variety of programs to support its mission, including emergency response and disaster relief efforts, long-term development projects, and advocacy campaigns to promote social change. The organization also partners with local communities, governments, and other organizations to ensure that its work is sustainable and effective.\n\n" +
                        "Overall, CARE International is dedicated to creating a world where all individuals have the opportunity to live healthy, fulfilling lives free from poverty and injustice.\n",
                "https://my.care.org/site/Donation2?df_id=30733&mfc_pref=T&30733.donation=form1&s_src=172220000000",
                R.drawable.care
            )
        )
        itemList.add(
            ItemsModal(
                "Hopelink",
                "Give to people in need.",
                "Hopelink is a non-profit organization that provides a range of services to help individuals and families in need achieve stability and self-sufficiency. The organization was founded in 1971 and operates in King and Snohomish counties in Washington State.\n\n" +
                        "Hopelink's services include food assistance, financial assistance for housing and utilities, adult education and job training, early childhood education, and transportation assistance. The organization also offers a range of support services, including counseling, referrals to community resources, and emergency assistance.\n\n" +
                        "Hopelink works to address the root causes of poverty by providing a holistic approach to addressing the needs of its clients. The organization's services are designed to help individuals and families overcome the barriers that prevent them from achieving stability and self-sufficiency, such as lack of education, limited job skills, and financial hardship.\n\n" +
                        "Hopelink partners with local businesses, government agencies, and community organizations to provide its services, and relies on the support of volunteers and donors to carry out its mission. The organization is committed to creating a community where all individuals have the opportunity to thrive, regardless of their income or circumstances.\n\n" +
                        "Overall, Hopelink is dedicated to helping individuals and families in need build brighter futures for themselves and their communities. The organization's comprehensive approach to addressing the root causes of poverty has made a positive impact on the lives of countless individuals in the Pacific Northwest.\n\n,",
                "https://www.hopelink.org/take-action/donate-goods-services",
                R.drawable.hopelink
            )
        )
        itemList.add(
            ItemsModal(
                "Mercy Ships",
                "Provide for life-saving healthcare.",
                "Mercy Ships is a global charity organization that provides free medical care and humanitarian aid to impoverished communities in developing countries. The organization operates a fleet of hospital ships that are staffed by volunteer medical professionals from all over the world.\n\n" +
                        "The ships are equipped with state-of-the-art medical facilities, including operating rooms, recovery wards, and diagnostic equipment. They travel to some of the world's poorest nations, where they provide medical services such as cataract surgeries, cleft lip and palate repairs, orthopedic procedures, and more.\n\n" +
                        "Mercy Ships also works to improve healthcare infrastructure in the countries where they operate. They provide training for local healthcare professionals, and partner with local governments and organizations to improve healthcare access for those who need it most.\n\n" +
                        "In addition to medical care, Mercy Ships provides humanitarian aid such as food, water, and shelter to those in need. They also offer education and vocational training programs to help individuals and communities build brighter futures.\n\n" +
                        "Overall, Mercy Ships is dedicated to bringing hope and healing to those who are most vulnerable and in need of assistance. Their work has positively impacted the lives of countless individuals and communities around the world.",
                "https://www.mercyships.org/",
                R.drawable.mercyships
            )
        )
        itemList.add(
            ItemsModal(
                "Project Healthy Children",
                "Donate for children's healthcare.",
                "Project Healthy Children (PHC) is a non-profit organization that works to combat malnutrition and micronutrient deficiencies in developing countries. The organization was founded in 2001 and operates in several countries in Africa and Asia.\n\n" +
                        "PHC's mission is to improve the nutritional status of populations in developing countries by fortifying staple foods with essential vitamins and minerals. The organization works with local governments, businesses, and communities to implement sustainable food fortification programs that reach those who are most in need.\n\n" +
                        "PHC uses a data-driven approach to determine the most effective and efficient ways to address micronutrient deficiencies in each country where it operates. The organization works to establish partnerships with local food producers and manufacturers to ensure that fortified foods are readily available and affordable for all.\n\n" +
                        "In addition to food fortification programs, PHC also conducts research and advocacy to raise awareness about the importance of nutrition and to promote evidence-based solutions to malnutrition. The organization collaborates with a range of partners, including academic institutions, non-profit organizations, and government agencies, to achieve its goals.\n\n" +
                        "Overall, Project Healthy Children is dedicated to improving the health and well-being of populations in developing countries by addressing the root causes of malnutrition and micronutrient deficiencies. The organization's work has made a significant impact on the lives of countless individuals, particularly children and women, who are most vulnerable to the effects of malnutrition.",
                "https://projecthealthychildren.org/",
                R.drawable.phc
            )
        )
        itemList.add(
            ItemsModal(
                "Living Goods",
                "Support equality in healthcare.",
                "Living Goods is a non-profit organization that works to improve the health and well-being of communities in Africa by supporting a network of community health workers. The organization was founded in 2007 and operates in several countries, including Kenya, Uganda, and Myanmar.\n\n" +
                        "Living Goods' mission is to create sustainable and scalable solutions for delivering quality healthcare to those who need it most. The organization trains and supports community health workers who provide a range of health services, including health education, treatment of common illnesses, and referrals to health facilities.\n\n" +
                        "In addition to its focus on community health workers, Living Goods also uses innovative technology to improve the efficiency and effectiveness of its programs. The organization's mobile health platform allows community health workers to access real-time data and resources, enabling them to better serve their communities.\n\n" +
                        "Living Goods works in partnership with local governments, non-profit organizations, and other stakeholders to ensure that its programs are sustainable and effective. The organization is committed to building strong and resilient healthcare systems that can meet the needs of communities in the long term.\n\n" +
                        "Overall, Living Goods is dedicated to improving the health and well-being of communities in Africa by empowering and supporting community health workers. The organization's innovative approach to healthcare delivery has made a significant impact on the lives of countless individuals, particularly those living in remote and underserved areas.\n\n",
                "https://livinggoods.org/give/",
                R.drawable.livinggoods
            )
        )
        itemList.add(
            ItemsModal(
                "TheirWorld",
                "Support a bright future for children.",
                "Theirworld is a global non-profit organization that is dedicated to improving the lives of children and young people around the world. The organization was founded in 2002 and operates in several countries, with a focus on the most vulnerable and marginalized communities.\n" +
                        "\n" +
                        "Theirworld's mission is to create a brighter future for every child by unlocking their potential through education, health, and protection. The organization works to remove the barriers that prevent children and young people from reaching their full potential, including poverty, discrimination, and lack of access to basic services.\n" +
                        "\n" +
                        "Theirworld's programs focus on a range of issues affecting children and young people, including early childhood development, education, and child protection. The organization also advocates for policies and investments that support the health and well-being of children and young people around the world.\n" +
                        "\n" +
                        "Theirworld works in partnership with governments, non-profit organizations, and other stakeholders to ensure that its programs and advocacy efforts are effective and sustainable. The organization also engages with the private sector to promote innovative solutions to global challenges.\n" +
                        "\n" +
                        "Overall, Theirworld is dedicated to creating a world where every child has the opportunity to thrive and reach their full potential. The organization's focus on education, health, and protection has made a significant impact on the lives of countless children and young people around the world.\n",
                "https://theirworld.org/donate/",
                R.drawable.theirworld
            )
        )
        itemList.add(
            ItemsModal(
                "United World Schools",
                "Donate for equal access to education.",
                " United World Schools (UWS) is a non-profit organization that works to improve access to education for children in some of the world's poorest regions. The organization was founded in 2008 and operates in Cambodia, Myanmar, and Nepal.\n" +
                        "\n" +
                        "UWS's mission is to provide high-quality education to children in marginalized communities, with a focus on those who are most in need. The organization works to establish and sustain community-led schools that provide a safe and supportive learning environment for children.\n" +
                        "UWS's approach to education is grounded in the belief that education is a fundamental right and a powerful tool for breaking the cycle of poverty. The organization works closely with local communities to develop culturally appropriate curricula and to ensure that schools are sustainable and integrated into the community.\n" +
                        "\n" +
                        "In addition to its focus on education, UWS also works to promote gender equality and to empower communities to take charge of their own development. The organization's programs aim to improve health and nutrition outcomes for children, and to promote social and economic development in the communities it serves.\n" +
                        "\n" +
                        "UWS works in partnership with local governments, non-profit organizations, and other stakeholders to ensure that its programs are effective and sustainable. The organization also engages with volunteers and donors to support its mission.\n" +
                        "\n" +
                        "Overall, United World Schools is dedicated to improving access to education for children in some of the world's poorest regions. The organization's community-led approach has made a significant impact on the lives of countless children, helping them to break the cycle of poverty and to build brighter futures for themselves and their communities.\n",
                "https://www.unitedworldschools.org/donate/donate/10/direct-debit",
                R.drawable.unitedworld
            )
        )
        itemList.add(
            ItemsModal(
                "Plan International",
                "Promote equality through education!",
                "Plan International is a global non-profit organization that works to advance the rights of children and equality for girls. The organization was founded in 1937 and operates in over 70 countries around the world.\n" +
                        "\n" +
                        "Plan International's mission is to promote the rights of children and to achieve gender equality by empowering communities and supporting children and young people. The organization focuses on issues such as education, health, child protection, and economic empowerment.\n" +
                        "Plan International's programs are designed to ensure that children and young people have access to education, healthcare, and other basic services, regardless of their gender or background. The organization works to strengthen the capacity of local communities to address the needs of children and to advocate for their rights.\n" +
                        "\n" +
                        "In addition to its focus on children's rights, Plan International is committed to promoting gender equality and empowering girls and young women. The organization's programs aim to improve access to education and economic opportunities for girls and to eliminate harmful practices such as child marriage and female genital mutilation.\n" +
                        "\n" +
                        "Plan International works in partnership with local governments, non-profit organizations, and other stakeholders to ensure that its programs are effective and sustainable. The organization also engages with volunteers and donors to support its mission.\n" +
                        "\n" +
                        "Overall, Plan International is dedicated to promoting the rights of children and to achieving gender equality by empowering communities and supporting children and young people. The organization's focus on gender equality and children's rights has made a significant impact on the lives of countless individuals around the world.\n",
                "https://projecthealthychildren.org/",
                R.drawable.planinternational
            )
        )
        itemList.add(
            ItemsModal(
                "Charity: Water",
                "Provide clean water to those who need it.",
                "Charity: water is a non-profit organization founded in 2006 with the goal of providing access to clean and safe drinking water to people in developing countries. The organization's mission is to end the global water crisis by bringing clean and safe drinking water to every person on the planet.\n" +
                        "\n" +
                        "The organization works in areas where access to clean water is limited or non-existent, partnering with local organizations and governments to implement sustainable water solutions that are tailored to the specific needs of each community. Some of the projects implemented by Charity: water include drilling wells, constructing rainwater catchment systems, and installing water filtration systems.\n" +
                        "\n" +
                        "Charity: water has a strong focus on sustainability, recognizing that simply providing access to water is not enough to ensure lasting change. To ensure the sustainability of its projects, the organization provides training to community members on maintenance and repair of the water systems, and also uses technology such as remote sensors and mobile apps to monitor the projects and ensure that they continue to function properly over time.\n" +
                        "\n" +
                        "In addition to its work on the ground, Charity: water is also dedicated to raising awareness about the global water crisis and advocating for policy changes that will help to address the issue. The organization uses its platform to educate individuals, companies, and governments about the impact of the water crisis, and to promote solutions that can make a difference.\n" +
                        "\n" +
                        "Charity: water is funded through individual donations, corporate partnerships, and fundraising events. The organization has a strong commitment to transparency and accountability, and is proud to be able to say that 100% of public donations go directly to fund water projects. Administrative costs and overhead are covered by private donors, so that every dollar donated by the public goes directly towards providing clean water to those in need.\n" +
                        "\n" +
                        "Since its founding, Charity: water has brought clean water to over 12 million people in 29 countries around the world. The organization continues to work tirelessly towards its goal of ending the global water crisis, recognizing that access to clean water is not just a basic human right, but also a key factor in achieving health, education, and economic development.\n",
                "https://www.charitywater.org/donate",
                R.drawable.charitywater
            )
        )
        itemList.add(
            ItemsModal(
                "Water.org",
                "Support communities with water.",
                "Water.org is a non-profit organization founded in 2009 with the mission of providing access to safe water and sanitation to people in developing countries. The organization's goal is to empower people to break the cycle of poverty and achieve their full potential by providing them with the tools they need to access safe water and sanitatWater.org works through a combination of innovative financial solutions and strategic partnerships with local organizations and governments to address the water crisis in a sustainable way. The organization's WaterCredit initiative, for example, provides small loans to people in need, allowing them to finance the construction of their own water and sanitation solutions. This approach not only helps to ensure that the solutions are tailored to the specific needs of each community, but also helps to promote financial empowerment and entrepreneurship.\n" +
                        "\n" +
                        "In addition to its work on the ground, Water.org is also dedicated to raising awareness about the water crisis and advocating for policy changes that will help to address the issue. The organization uses its platform to educate individuals, companies, and governments about the impact of the water crisis, and to promote solutions that can make a difference.\n" +
                        "\n" +
                        "Water.org is funded through a combination of donations from individuals, foundations, and corporations, and through its WaterEquity initiative, which uses impact investing to fund water and sanitation projects. The organization is committed to transparency and accountability, and has received high ratings from independent charity evaluators for its financial management and effectiveness.\n" +
                        "\n" +
                        "Since its founding, Water.org has impacted the lives of over 33 million people in 13 countries around the world. The organization continues to work towards its goal of ensuring that everyone, everywhere has access to safe water and sanitation, recognizing that this is not just a basic human right, but also a key factor in achieving health, education, and economic development.\nWater.org is a non-profit organization founded in 2009 with the mission of providing access to safe water and sanitation to people in developing countries. The organization's goal is to empower people to break the cycle of poverty and achieve their full potential by providing them with the tools they need to access safe water and sanitatWater.org works through a combination of innovative financial solutions and strategic partnerships with local organizations and governments to address the water crisis in a sustainable way. The organization's WaterCredit initiative, for example, provides small loans to people in need, allowing them to finance the construction of their own water and sanitation solutions. This approach not only helps to ensure that the solutions are tailored to the specific needs of each community, but also helps to promote financial empowerment and entrepreneurship.\n" +
                        "\n" +
                        "In addition to its work on the ground, Water.org is also dedicated to raising awareness about the water crisis and advocating for policy changes that will help to address the issue. The organization uses its platform to educate individuals, companies, and governments about the impact of the water crisis, and to promote solutions that can make a difference.\n" +
                        "\n" +
                        "Water.org is funded through a combination of donations from individuals, foundations, and corporations, and through its WaterEquity initiative, which uses impact investing to fund water and sanitation projects. The organization is committed to transparency and accountability, and has received high ratings from independent charity evaluators for its financial management and effectiveness.\n" +
                        "\n" +
                        "Since its founding, Water.org has impacted the lives of over 33 million people in 13 countries around the world. The organization continues to work towards its goal of ensuring that everyone, everywhere has access to safe water and sanitation, recognizing that this is not just a basic human right, but also a key factor in achieving health, education, and economic development.\n",
                "https://water.org/donate/",
                R.drawable.waterorg
            )
        )
        itemList.add(
            ItemsModal(
                "The Water Project",
                "Provide water for the sub-Saharan region.",
                "The Water Project is a non-profit organization founded in 2006 with a mission to provide clean and safe drinking water to communities in sub-Saharan Africa. The organization focuses on implementing sustainable water solutions that are tailored to the specific needs of each community, working in partnership with local organizations and governments to achieve this goal.\n" +
                        "\n" +
                        "Access to safe drinking water is a critical issue in sub-Saharan Africa, where millions of people lack access to clean water sources. This not only leads to the spread of waterborne illnesses but also hinders economic and social development. The Water Project recognizes that access to safe drinking water is not only a basic human right, but also a key factor in achieving health, education, and economic development. As such, the organization is dedicated to addressing the water crisis in a sustainable and effective way.\n" +
                        "\n" +
                        "The Water Project uses a variety of approaches to improve access to safe drinking water, including drilling wells, constructing rainwater catchment systems, and installing water filtration systems. The organization partners with local communities and organizations to ensure that the solutions are tailored to the specific needs of each community, taking into account factors such as geography, climate, and cultural practices. By working closely with local partners, The Water Project ensures that the solutions implemented are sustainable over time and that communities are empowered to take ownership of their water systems.\n" +
                        "\n" +
                        "In addition to its work on the ground, The Water Project is also dedicated to raising awareness about the water crisis and advocating for policy changes that will help to address the issue. The organization uses its platform to educate individuals, companies, and governments about the impact of the water crisis, and to promote solutions that can make a difference.\n" +
                        "\n" +
                        "The Water Project is funded through a combination of donations from individuals, foundations, and corporations, and through partnerships with other organizations. The organization is committed to transparency and accountability, and works to ensure that the funds it raises are used effectively to achieve its mission. In addition, The Water Project is dedicated to measuring the impact of its work, tracking key metrics such as the number of people impacted, the sustainability of the solutions implemented, and the reduction in waterborne illnesses.\n" +
                        "\n" +
                        "Since its founding, The Water Project has impacted the lives of over 600,000 people in sub-Saharan Africa, providing them with access to clean and safe drinking water. The organization continues to work towards its goal of ensuring that everyone, everywhere has access to safe water and sanitation, recognizing that this is not just a basic human right, but also a key factor in achieving health, education, and economic development. By implementing sustainable and effective water solutions and advocating for policy changes, The Water Project is making a significant contribution to addressing the water crisis in sub-Saharan Africa.\n",
                "https://thewaterproject.org/?form=give-clean-water",
                R.drawable.thewaterproject
            )
        )
        itemList.add(
            ItemsModal(
                "Carbon 180",
                "Slow the spread of carbon!",
                "Carbon 180 is a non-profit organization that is focused on advancing carbon removal as a critical tool in the fight against climate change. The organization was founded in 2015 and has a team of experts and advocates who are working towards a shared goal of achieving a net-zero carbon future.\n" +
                        "\n" +
                        "The name Carbon 180 is a reference to the concept of flipping the carbon equation – moving from adding carbon to the atmosphere to removing it. The organization's mission is to create the conditions for carbon removal to flourish by advancing science, policy, and innovation. The ultimate goal is to accelerate the development and deployment of carbon removal solutions and to help the world reach net-zero carbon emissions.\n" +
                        "\n" +
                        "Carbon removal, also known as negative emissions technologies, refers to a set of technologies and approaches that aim to remove carbon dioxide from the atmosphere and store it in long-term sinks such as underground geological formations, forests, or oceans. These technologies are gaining increasing attention in the fight against climate change as a way to mitigate its impacts and reach the goal of net-zero emissions.\n" +
                        "\n" +
                        "Carbon 180 works with partners across academia, industry, and government to drive research and development of new carbon removal technologies, influence policy and market incentives to support their deployment, and engage with the public to raise awareness and build support for carbon removal. The organization believes that carbon removal has the potential to provide an additional tool to address climate change, but that it must be done in a responsible and sustainable way.\n" +
                        "\n" +
                        "Carbon 180 has several programs and initiatives aimed at advancing carbon removal, including policy advocacy, research collaborations, and public engagement. The organization's policy program aims to influence policy at the local, national, and international levels to support the deployment of carbon removal technologies. Carbon 180 advocates for policies that provide incentives for carbon removal, promote research and development, and ensure environmental and social sustainability.\n" +
                        "\n" +
                        "The Carbon Dioxide Removal Hub is a collaborative network of researchers, scientists, and practitioners who work to advance the science and understanding of carbon removal technologies. The Hub facilitates knowledge exchange, supports research collaborations, and provides resources and tools for stakeholders interested in carbon removal.\n" +
                        "CarbonShot is another initiative that Carbon 180 is involved in, which is a public-private partnership that focuses on accelerating the development and deployment of carbon removal solutions. CarbonShot aims to catalyze breakthrough innovations in carbon removal and create a supportive ecosystem for their commercialization.\n" +
                        "\n" +
                        "In conclusion, Carbon 180 is a non-profit organization that is working to advance carbon removal as a critical tool in the fight against climate change. The organization's work is focused on advancing science, policy, and innovation to create the conditions for carbon removal to flourish. By driving innovation, shaping policy, and engaging stakeholders, Carbon 180 is helping to create a more sustainable and resilient future for all.\n",
                "https://carbon180.org/donate",
                R.drawable.carbon180
            )
        )
        itemList.add(
            ItemsModal(
                "Clean Air Task Force",
                "Provide resources to reduce pollution.",
                "The Clean Air Task Force (CATF) is a non-profit organization that is focused on reducing air pollution and addressing the impacts of climate change. The organization was founded in 1996 and has a team of experts and advocates who are working towards a shared goal of creating a cleaner and healthier world.\n" +
                        "\n" +
                        "CATF's mission is to drive the adoption of clean energy and clean air solutions by informing and advocating for effective public policies. The organization believes that strong policies are essential to driving the transition to a low-carbon economy and reducing the impacts of air pollution on public health and the environment.\n" +
                        "\n" +
                        "The Clean Air Task Force has several programs and initiatives aimed at achieving its mission, including advocacy, research, and public education. The organization's advocacy program focuses on shaping policy at the local, national, and international levels to promote clean energy and reduce air pollution. CATF advocates for policies that promote the adoption of renewable energy, energy efficiency, and clean transportation.\n" +
                        "\n" +
                        "The organization's research program is focused on developing and advancing innovative solutions to reduce air pollution and address climate change. CATF's research team includes scientists, engineers, and policy experts who work on a range of issues related to clean energy, carbon capture and storage, and air pollution control.\n" +
                        "\n" +
                        "CATF also works to educate the public and raise awareness about the impacts of air pollution and climate change. The organization produces reports, briefings, and other materials to inform policymakers, media, and the general public about the latest developments in clean energy and air pollution control.\n" +
                        "\n" +
                        "One of CATF's key areas of focus is reducing methane emissions from the oil and gas sector. Methane is a potent greenhouse gas that is responsible for a significant portion of the warming that is driving climate change. CATF works to develop and promote policies and technologies to reduce methane emissions from oil and gas operations.\n" +
                        "\n" +
                        "In conclusion, the Clean Air Task Force is a non-profit organization that is focused on reducing air pollution and addressing the impacts of climate change. The organization's work is focused on informing and advocating for effective public policies that promote clean energy and reduce air pollution. By advancing innovative solutions and raising public awareness, CATF is helping to create a cleaner and healthier future for all.\n",
                "https://donate.catf.us/page/39127/donate/1",
                R.drawable.catf
            )
        )
        itemList.add(
            ItemsModal(
                "Cool Earth",
                "Donate to preserve our rainforests.",
                "Cool Earth is a non-profit organization that is focused on protecting rainforests and the communities that depend on them. The organization was founded in 2007 by a group of conservationists who believed that local people were the key to preserving rainforests and the biodiversity they support.\n" +
                        "\n" +
                        "Cool Earth's mission is to work alongside rainforest communities to halt deforestation and climate change. The organization believes that by empowering local people to take control of their forests, they can create a sustainable future for both people and the planet.\n" +
                        "Cool Earth's approach is unique in that it focuses on working with local people to create sustainable livelihoods that don't rely on cutting down trees. The organization provides funding, training, and technical support to help communities develop sustainable businesses such as beekeeping, cocoa farming, and ecotourism.\n" +
                        "\n" +
                        "In addition to supporting sustainable livelihoods, Cool Earth also works to protect rainforests from illegal logging and other threats. The organization works with communities to create forest patrols and monitoring systems to identify and prevent illegal activities. Cool Earth also supports reforestation efforts to restore degraded areas of the forest.\n" +
                        "\n" +
                        "One of the key principles of Cool Earth's approach is that rainforest protection must go hand in hand with the needs and aspirations of local people. The organization believes that by working together, they can create a sustainable future for both people and the planet.\n" +
                        "\n" +
                        "Cool Earth has partnered with over 150 rainforest communities in countries such as Peru, Papua New Guinea, and the Democratic Republic of Congo. The organization has helped to protect over 900,000 acres of rainforest and has supported thousands of people to develop sustainable livelihoods.\n" +
                        "\n" +
                        "Overall, Cool Earth is a non-profit organization that is focused on protecting rainforests and the communities that depend on them. The organization's unique approach of working with local people to create sustainable livelihoods has been successful in protecting rainforests and promoting sustainable development. By empowering local people to take control of their forests, Cool Earth is helping to create a more sustainable and equitable future for all.\n",
                "https://www.coolearth.org/donate/usd/",
                R.drawable.coolearth
            )
        )
        itemList.add(
            ItemsModal(
                "Ocean Conservancy",
                "Donate to preserve our oceans.",
                "Ocean Conservancy is a non-profit organization that has been working towards the protection and conservation of the ocean and its wildlife for over 50 years. The organization was founded in 1972 with a mission to promote healthy and diverse ocean ecosystems, free from pollution, overfishing, and other threats.\n" +
                        "\n" +
                        "The ocean covers over 70% of the Earth's surface, and it plays a critical role in regulating the Earth's climate, supporting marine biodiversity, and providing food, livelihoods, and recreation for millions of people around the world. However, the ocean is facing unprecedented challenges from human activities, such as pollution, overfishing, climate change, and habitat destruction. These challenges not only impact the ocean and its inhabitants but also have far-reaching consequences for the health and well-being of people worldwide.\n" +
                        "\n" +
                        "Ocean Conservancy recognizes the urgent need to address these challenges and works to bring together individuals, communities, and organizations to take collective action towards a healthy and sustainable ocean. The organization operates at the intersection of science, policy, and advocacy to develop and promote science-based solutions that address the most pressing ocean conservation issues.\n" +
                        "\n" +
                        "One of the key focus areas of Ocean Conservancy is ocean plastic pollution. Every year, an estimated 8 million metric tons of plastic waste enters the ocean, threatening marine wildlife, habitats, and human health. To address this issue, Ocean Conservancy leads the International Coastal Cleanup, the world's largest volunteer effort to clean up ocean debris. Since its inception in 1986, the program has mobilized millions of volunteers to remove more than 350 million pounds of trash from beaches and waterways around the world.\n" +
                        "\n" +
                        "In addition to ocean plastic pollution, Ocean Conservancy works to promote sustainable fisheries practices to ensure that fish populations and ecosystems are healthy and resilient. Overfishing is a significant threat to the ocean's health, and it can have cascading impacts on the entire marine food web. Ocean Conservancy advocates for science-based fisheries management policies that protect the ocean's biodiversity while supporting the livelihoods of fishing communities.\n" +
                        "\n" +
                        "Climate change is another critical issue that Ocean Conservancy addresses. The ocean plays a vital role in regulating the Earth's climate, but it is also impacted by climate change, including rising sea levels, ocean acidification, and more frequent and intense extreme weather events. Ocean Conservancy advocates for policies that reduce greenhouse gas emissions and support the transition to a clean energy economy.\n" +
                        "\n" +
                        "Overall, Ocean Conservancy is dedicated to promoting a healthy and sustainable ocean that benefits people and the planet. The organization's work spans from scientific research and analysis to policy advocacy and public engagement. By bringing together stakeholders across different sectors and countries, Ocean Conservancy works to create a collective impact towards a brighter future for the ocean and its inhabitants.\n",
                "https://donate.oceanconservancy.org/page/92465/donate/1",
                R.drawable.oceancons
            )
        )
        itemList.add(
            ItemsModal(
                "Oceana",
                "Help restore the world's oceans.",
                "Oceana is a non-profit organization dedicated to protecting and restoring the world's oceans. Founded in 2001, it has become the largest international advocacy organization focused solely on ocean conservation. Oceana's mission is to advocate for science-based policies that promote the restoration of marine ecosystems and the protection of marine wildlife.\n" +
                        "The organization has a global presence, with offices in North and South America, Europe, and Asia. Its team of experts includes marine scientists, economists, policy analysts, and attorneys, who work together to develop and implement strategies for ocean conservation. Oceana also collaborates with other organizations, governments, and businesses to achieve its goals.\n" +
                        "\n" +
                        "One of Oceana's primary areas of focus is advocating for sustainable fishing practices that reduce the impact of overfishing and protect threatened species. The organization works to promote policies that ensure fisheries are managed in a way that is both ecologically sustainable and economically viable. Oceana uses a range of tactics to achieve this goal, including legal action, public campaigns, and scientific research.\n" +
                        "\n" +
                        "Oceana's campaigns have led to significant victories for ocean conservation. For example, the organization successfully campaigned for a ban on bottom trawling in the deep sea off the coast of Ireland, a practice that was destroying fragile marine ecosystems. Oceana has also worked to reduce the impact of bycatch in commercial fishing, which is a major threat to many marine species. Through its efforts, Oceana has helped to secure protections for vulnerable marine species and habitats, including the designation of marine protected areas in several countries.\n" +
                        "In addition to its work on sustainable fishing practices, Oceana also advocates for the prevention of oil and gas drilling in sensitive marine areas. The organization works to reduce the impact of plastic pollution on the oceans and to promote the use of renewable energy sources as a way to reduce the environmental impact of human activities.\n" +
                        "\n" +
                        "Oceana's efforts are guided by a commitment to scientific research and evidence-based decision-making. The organization conducts its own research and collaborates with leading scientists around the world to develop solutions for ocean conservation. Oceana also works to raise public awareness of the importance of ocean conservation and to mobilize individuals and communities to take action to protect the oceans.\n" +
                        "\n" +
                        "In summary, Oceana is a non-profit organization that is dedicated to protecting and restoring the health of the world's oceans. Through its advocacy, research, and collaboration with other organizations, Oceana is working to promote sustainable fishing practices, reduce the impact of oil and gas drilling, and prevent plastic pollution. The organization is a leader in the field of ocean conservation, and its efforts are critical to preserving the health of the world's oceans for future generations.\n",
                "https://act.oceana.org/page/95375/donate/1?ea.tracking.id=homepage&utm_campaign=general&utm_source=header&utm_medium=website&transaction.donationAmt=&op=DONATE&_ga=2.246740994.769951391.1678386966-582366699.1678386966",
                R.drawable.oceana
            )
        )
        itemList.add(
            ItemsModal(
                "Sea Shepherd",
                "Protect marine wildlife from exploitation!",
                "Sea Shepherd is a non-profit marine conservation organization that was founded in 1977. The organization's mission is to protect and defend marine wildlife and ecosystems from illegal exploitation and destruction.\n" +
                        "\n" +
                        "Sea Shepherd's tactics include direct action campaigns, which involve physically intervening to prevent illegal fishing, hunting, and other activities that harm marine life. The organization uses a fleet of vessels, including ships and smaller boats, to patrol the world's oceans and confront illegal activities. Sea Shepherd also conducts research and works to raise public awareness of the need to protect marine wildlife and ecosystems.\n" +
                        "\n" +
                        "Sea Shepherd campaigns have focused on a range of issues, including the fight against whaling, dolphin hunting, and the illegal fishing of sharks, bluefin tuna, and other threatened species. The organization has also worked to protect marine habitats, such as coral reefs and seagrass beds, from destruction by human activities.\n" +
                        "\n" +
                        "Sea Shepherd's direct action campaigns have been controversial, with some critics arguing that the organization's tactics are overly aggressive or illegal. However, Sea Shepherd maintains that its actions are necessary to protect marine wildlife and that it operates within the bounds of international law.\n" +
                        "\n" +
                        "In addition to its direct action campaigns, Sea Shepherd also advocates for policy changes that support marine conservation. The organization works with governments, NGOs, and other stakeholders to promote sustainable fishing practices, protect marine habitats, and prevent illegal activities.\n" +
                        "\n" +
                        "Overall, Sea Shepherd is a dedicated and passionate organization that is committed to protecting marine wildlife and ecosystems. The organization's direct action campaigns have drawn attention to the plight of marine life and have been successful in bringing about positive changes in some cases. While controversial, Sea Shepherd's efforts have undoubtedly contributed to the broader movement for marine conservation and have helped to raise public awareness of the need to protect the world's oceans.\n",
                "https://seashepherd.org/donate/",
                R.drawable.seashep
            )
        )
        /* itemList.add(
            ItemsModal(
                "name", "desc", "content",
                "link", R.drawable.kissing_cats
            )
        ) */

        // on below line we are notifying adapter
        // that data has been updated.
        itemsAdapter.notifyDataSetChanged()

    }


    // calling on create option menu
    // layout to inflate our menu file.
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // below line is to get our inflater
        val inflater = menuInflater

        // inside inflater we are inflating our menu file.
        inflater.inflate(R.menu.search_menu, menu)

        // below line is to get our menu item.
        val searchItem: MenuItem = menu.findItem(R.id.searchBar)

        // getting search view of our item.
        val searchView: SearchView = searchItem.actionView as SearchView

        // below line is to call set on query text listener method.
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(msg: String): Boolean {
                // inside on query text change method we are
                // calling a method to filter our recycler view.
                filter(msg)
                return false
            }
        })
        return true
    }

    private fun filter(text: String) {
        // creating a new array list to filter our data.
        val filteredlist: ArrayList<ItemsModal> = ArrayList()

        // running a for loop to compare elements.
        for (item in itemList) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.name.lowercase().contains(text.lowercase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item)
            }
            if (item.short_desc.lowercase().contains(text.lowercase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item)
            }
            if (item.content_desc.lowercase().contains(text.lowercase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item)
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "no data found...", Toast.LENGTH_SHORT).show()
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            itemsAdapter.filterList(filteredlist)
        }
    }

    override fun onItemClicked(position: Int) {
        val intent = Intent(this, ContentActivity::class.java)
        intent.putExtra("name", itemList[position].name)
        intent.putExtra("content_desc", itemList[position].content_desc)
        intent.putExtra("link", itemList[position].link)
        intent.putExtra("image", itemList[position].image)
        startActivity(intent)
    }

}
