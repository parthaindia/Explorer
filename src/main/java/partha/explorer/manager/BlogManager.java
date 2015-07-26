/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partha.explorer.manager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import partha.explorer.dto.Blog;

/**
 *
 * @author Partha
 */
public class BlogManager {

    static String BLOG_TABLE = "blog";

    public static void main(String arg[]) throws Exception {

        Blog bl = new Blog();
        bl.setName("Hogenakkal_Falls");
        bl.setUrl("http://howyoudoin.files.wordpress.com/2007/12/p1040139.jpg");
        ArrayList ar = new ArrayList();
        ar.add("Hogenakkal Falls or Hogenakal Falls is a waterfall in South India on the river Kaveri. It is located in the Dharmapuri district of the southern Indian state of Tamil Nadu, about 180 km (110 mi) from Bangalore and 46 km (29 mi) from Dharmapuri town.[7] It is sometimes referred to as the \"Niagara of India\". With its fame for medicinal baths and hide boat rides, it is a major tourist attraction. Carbonatite rocks in this site are considered to be the oldest of its kind in South Asia and one of the oldest in the world.[8] This is also the site of a proposed project to generate drinking water.");
        ar.add("http://howyoudoin.files.wordpress.com/2007/12/p1040139.jpg");
        ar.add("Boating in Hogenakkal is allowed during the dry-season as the water falls are not strong enough to disrupt the passage of the boats. This is the main source of income for these boat operators. The coracles are about 2.24 m (7 ft 4 in) in diameter, but still can take a load of eight persons at a time.[12] These coracles are made of bamboo, and with all materials available takes about a day to build. The bottom of the boats are made waterproof by the use of hides, but sometimes with sheets of plastic.[");
        ar.add("https://en.wikipedia.org/wiki/Hogenakkal_Falls#/media/File:HoggenekkalLandingParisalsPanorama2.jpg");
        ar.add("Weather\n"
                + "The best season to visit is soon after the monsoons, when the river is in full spate. But some tourists prefer to visit during off-season to skip the crowd. The temperature in summer varies between 23–34 °C (73–93 °F) while during the winter it is still pleasant and ranges from 13–27 °C (55–81 °F).[");
        ar.add("http://howyoudoin.files.wordpress.com/2007/12/p1040139.jpg");
        ar.add("http://howyoudoin.files.wordpress.com/2007/12/p1040139.jpg");
        ar.add("http://images.worthview.com/wp-content/uploads/2010/08/SDC13564.jpg");
        bl.setBlogInfo(ar);

        DBManager.getDB().addDefault(BLOG_TABLE, new Gson().toJson(bl));

        Blog nan = new Blog();
        nan.setName("Nandi hills");
        nan.setUrl("http://www.couponraja.in/theroyale/wp-content/uploads/2014/10/Nandi-Hills.jpg");
        ar = new ArrayList();
        ar.add("Nandi hills is a popular hangout for Bangalooreans. It is a hill 1478m above sea level. The attractions here include a garden maintained by Horticultural department, Tipu's drop from where Tipu used to kill his prisoners and a temple with a thousand year old nandi statue. On the way to the hills there are sunflower gardens and wine yards.");
        ar.add("http://www.team-bhp.com/forum/attachments/travelogues/253018d1262068176-nandi-hills-early-morning-drive-dsc03703.jpg");
        ar.add("Do[edit]\n"
                + "\n"
                + "Check out the vineyards, grapes and cracked mustard seeds if you are lucky you can see them on the roads where the farmers spread them so that your car can thrash them. Also look out for cracks in the fort wall, which allow you to go outside and get some spectacular views of the plains below, eagles soaring level to your eyes. However, be careful as the terrain falls steeply down and a fall will certainly crack most of our body.\n"
                + "Paragliding . As at any paragliding site, keep the basics in mind and the time of the year and day and your flying skill in mind. Nandi hills is a fantastic place to fly from. Plenty of flat land all around the hills. Please look out for power lines when selecting a field for landing. There is usually a designated landing field.\n"
                + "Cycling Lot of bicycling clubs in Bangalore are into weekend cycling trips. High endurance levels are required to cycle uphill.\n"
                + "Trekking Plenty of trekking opportunities around the region. You can also go for a wild trek on the backside of the hill.");

        ar.add("Eat[edit]\n"
                + "\n"
                + "Club Cabana - It is a beautiful resort with water sports and a good bar. From NH7, take a left 2 Km before the BIAL flyover and drive straight for 1.5 km.\n"
                + "Hotel Sandarshini - in Chikballapur on the main Bangalore-Hyderabad highway NH-7 (B.B.Road),\n"
                + "Hotel Truptisagar - in Chikballapur on the main Bangalore-Hyderabad highway NH-7 (B.B.Road),\n"
                + "Hotel Shantisagar - in Chikballapur on the main Bangalore-Hyderabad highway NH-7 (B.B.Road),\n"
                + "Chats - Visit Pappu's Paanipuri Chat Centre, Basavanagudi Road, Chikballapur. (A must Visit)\n"
                + "Hotel Sowmya - (Lodge & Restaurant)in Chikballapur on the main Bangalore-Hyderabad highway NH-7 (B.B.Road),\n"
                + "UP Punjabi Dahba - on the main Bangalore-Hyderabad highway, on the right when traveling from Bangalore and just before the turning for to Nandi Hills.\n"
                + "Hotel Ranjitha - This hotel is on the top of the hill and the only one present. There is nothing special about the food.\n"
                + "Hotel Mayura Pine Top - a K.S.T.D.C owned hotel on top of the hill, with an attached restaurant and bar [4]. This is a safe place to sit and eat food safe from the monkeys and stray dogs.");

        ar.add("http://wikitravel.org/upload/shared//thumb/1/17/Nandi_Hills_Banner.jpg/800px-Nandi_Hills_Banner.jpg");
        ar.add("http://www.couponraja.in/theroyale/wp-content/uploads/2014/10/Nandi-Hills.jpg");
        nan.setBlogInfo(ar);

        DBManager.getDB().addDefault(BLOG_TABLE, new Gson().toJson(nan));

        Blog shiv = new Blog();
        shiv.setName("Shivagange");
        shiv.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Shivagange_Basavanna_1.JPG/1024px-Shivagange_Basavanna_1.JPG");
        ar = new ArrayList();
        ar.add("Shivagange is a mountain peak with a height of 1368 meters[1] and Hindu pilgrimage center located near Dobbaspet, in Bangalore Rural district India. It is situated 8 km from the town of Tumkur and 54 km from Bangalore.");
        ar.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Shivagange_From_Foot_Hills.JPG/1024px-Shivagange_From_Foot_Hills.JPG");
        ar.add("An interesting belief about this temple is that if an abhisheka is performed with ghee here, the ghee turns to butter. It is said that the ghee that turns to butter has medicinal powers and can cure many ailments. According to legend there exists a secret tunnel that extends from the sanctum sanctorum (Garba Griha) of this temple to the Gavi Gangadhareshwara temple in Bangalore, around 50 kilometer from this temple.");
        ar.add("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Shivagange_Olakal_Theertha.JPG/1024px-Shivagange_Olakal_Theertha.JPG");
        ar.add("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Shivagange_Basavanna_1.JPG/1024px-Shivagange_Basavanna_1.JPG");
        ar.add("Trekking[edit]\n"
                + "The area is a popular site for rock climbing in the Karnataka state.[3] The entire trail to the peak is well marked and the presence of man-made steps (often carved into the rocky landscape, but sometimes made from rocks) makes the trail suitable for beginners. There are frequent rest opportunities with stalls serving food and drinks. The vertical ascent is approximately 800 metres, much of which is climbed towards the end of the path where the trail becomes steep and narrow - safety rails are provided in such areas.[3]\n"
                + "Monkeys are a pest in the area, often snatching belongings (especially food) from unsuspecting trekkers.");
        ar.add("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Shivagange_Architecture_1.JPG/1024px-Shivagange_Architecture_1.JPG");
        shiv.setBlogInfo(ar);
        DBManager.getDB().addDefault(BLOG_TABLE, new Gson().toJson(shiv));

        Blog ran = new Blog();
        ran.setName("Rangaswamy betta");
        ran.setUrl("https://upload.wikimedia.org/wikipedia/en/thumb/b/b3/Bilikal_Rangaswamy_Temple.png/1024px-Bilikal_Rangaswamy_Temple.png");
        ar = new ArrayList();
        ar.add("The trek does not seem to last for an hour but behind the first there was a surprise of bigger betta (Hill in Kannada) and that was Rangaswamy betta. A thick forest full of shurbs; 70 Kms south of Bangalore city; Haven of elephants and thick plantations; A rock temple dedicated to lord Ranganathaswamy at the summit; If you ask me honestly then its an easy trek but thick and prickly shrubs add more adventure to it.");
        ar.add("http://i2.wp.com/trekkerpedia.com/wp-content/uploads/2013/07/Bilakal-forest-from-rangaswamy-betta-peak.jpg?resize=500%2C375");
        ar.add("Details of Bilakal Rangaswamy Betta: Trek Length: 4-5 Kms Type: Moderate Altitude: Around 3780 feet At the top: A temple, Ancient pond and 360 Degree view of the area around The trek starts at Thokasandra, almost 10-12 Kms from kanakapura. The trail is clear and is frequently used by the villagers to go to the temple.");
        ar.add("Bilikal Ranganatha Swamy Betta is a hill near Kanakapura town in the Indian state of Karnataka. It is located 70 km south of Bangalore city. Atop the hill is a temple dedicated to Lord Ranganatha Swamy. The temple and an adjacent quarters is housed underneath a huge granite rock. The hill is also known by the name Billikal Betta due to the whitish rocks near the summit that is visible from a long distance.[1] The peak is at a height of 3780 feet (1152 m).");
        ar.add("https://upload.wikimedia.org/wikipedia/en/thumb/b/b3/Bilikal_Rangaswamy_Temple.png/1024px-Bilikal_Rangaswamy_Temple.png");
        ran.setBlogInfo(ar);
        DBManager.getDB().addDefault(BLOG_TABLE, new Gson().toJson(ran));

    }

    public List<Blog> getAllBlogs() throws Exception {
        String blogJson = DBManager.getDB().getAll(BLOG_TABLE);
        List<Blog> blList = new Gson().fromJson(blogJson, new TypeToken<List<Blog>>() {
        }.getType());
        for (Blog b : blList) {
            b.setBlogInfo(null);
        }
        return blList;
    }

    public Blog getBlog(String blogId) throws Exception {
        if (blogId == null || blogId.equals("")) {
            return null;
        }
        String blogJson = DBManager.getDB().getByKey(BLOG_TABLE, blogId);
        List<Blog> blList = new Gson().fromJson(blogJson, new TypeToken<List<Blog>>() {
        }.getType());
        return blList.get(0);
    }

    public List<Blog> blogsearchQuery(String blogId) throws Exception {
        if (blogId == null || blogId.equals("")) {
            return null;
        }

        ArrayList resultList = new ArrayList();
        List<Blog> ret = new BlogManager().getAllBlogs();
        for (Blog bl : ret) {
            if (bl.getName().contains(blogId)) {
                resultList.add(bl);
            }
        }
        return resultList;

    }
}
