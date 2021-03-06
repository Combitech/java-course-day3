# java-course-day3

Kod från dag 3 i "Utveckling i modern Java"


#### Tider:
8.30-16.30 med en timmes lunch. Dagen delas upp efter kursdeltagarnas önskemål.

### Kursmaterial
Kursmaterialet för denna dagen består av detta git-repo och inspelningar från Teams-mötet. Se nedan för länkar:


[8.40-09.30](https://combitechcloud-my.sharepoint.com/personal/martin_frisk_combitech_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings%2FDag%203%20Java%2Dkurs%2D20220511%5F084008%2DM%C3%B6tesinspelning%2Emp4&parent=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings&ga=1)
- Lite kort repetition från förra gången. Introduktion till Spring och Spring Boot. Skapade en första Hello World-Controller i Spring Boot.

[9.40-10.30](https://combitechcloud-my.sharepoint.com/personal/martin_frisk_combitech_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings%2FDag%203%20Java%2Dkurs%2D20220511%5F094127%2DM%C3%B6tesinspelning%2Emp4&parent=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings&ga=1)
- Skapade UserController, UserDTO och UserEntity. Pratade om hur man skapade en klass som representerade en databastabell. La till application.properties för att kunna konfiguera vår Spring-applikation.

[10.45-11.30](https://combitechcloud-my.sharepoint.com/personal/martin_frisk_combitech_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings%2FDag%203%20Java%2Dkurs%2D20220511%5F104557%2DM%C3%B6tesinspelning%2Emp4&parent=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings&ga=1)
- Skapade UserService, mer metoder i Controller och metod för att skriva egen SQL.

[13.00-13.45](https://combitechcloud-my.sharepoint.com/personal/martin_frisk_combitech_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings%2FDag%203%20Java%2Dkurs%2D20220511%5F130024%2DM%C3%B6tesinspelning%2Emp4&parent=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings&ga=1)
- Lade till upgrade och delete i api:et för Users. Skapade en ny entity Organizations, varje User är knuten till en organization.

[13.55-14.20](https://combitechcloud-my.sharepoint.com/personal/martin_frisk_combitech_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings%2FDag%203%20Java%2Dkurs%2D20220511%5F135636%2DM%C3%B6tesinspelning%2Emp4&parent=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings&ga=1)
- Skapade en ny entity Rights. Varje User kan ha flera Rights och varje Right kan tillhöra fler än en User.

[14-40-15.10](https://combitechcloud-my.sharepoint.com/personal/martin_frisk_combitech_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings%2FDag%203%20Java%2Dkurs%2D20220511%5F144045%2DM%C3%B6tesinspelning%2Emp4&parent=%2Fpersonal%2Fmartin%5Ffrisk%5Fcombitech%5Fcom%2FDocuments%2FRecordings&ga=1)
- Skapade ett nytt api i User-tjänsten som anropade Image-tjänsten för att hämta bilder. För att få detta att fungera behövs det att man har en minio server körandes lokalt på datorn samt att man har tjänsten som byggdes dag 2 och som finns i repot java-course-day2 körandes lokalt.

### Dagens innehåll

Målet med dagen är att bygga ytterligare mikrotjänst. Denna gång med hjälp av Spring Boot (https://spring.io/projects/spring-boot). Vi kommer även att kolla på databaser med hjälp av JPA, Hibernate och då spara data i en H2-databas. Vi använder H2 då det är en liten simpel in-memory-databas så man slipper sätta upp en hel databas på sin lokala maskin eller behöva ansluta mot någon molnbaserad. Initial tanke var att köra databas i en Docker-container men i och med ändringarna för licenser för Docker Desktop så blev det alldeles för krångligt att få till.

Spring är med råge det största och mest populära ramverket inom Java och som utvecklare är det stor chans att man kommer stöta på någon variant av Spring. Spring Boot är en del av Spring som låter utvecklare bygga mikrotjänster på ett väldigt snabbt sätt. Där man följer "convention-over-configuration".


### Länkar till vidare läsning:

[dev.java](https://dev.java/)
- samlingssida med det senaste rörande Java-världen.

[spring.io](https://spring.io/)
- Springs officiella sida. Deras dokumentation är väldigt bra.

[Vlad Mihalecea](https://vladmihalcea.com/)
- Väldigt bra resurs för att lära sig mer om Hibernate/JPA.

[Baeldung](https://www.baeldung.com/)
- Mycket korta guider om i stort sett allt inom Java. Mycket Spring men även mycket annat. I bland lite ytligt och går inte riktigt in på djupet. Men för att få en hum om hur något fungerar så är det en bra resurs.

[/r/java](https://www.reddit.com/r/java/)
- subreddit om Java. Högt och lågt i diskussionerna men intressant att läsa och få en inblick i hur andra utvecklare ser på Java.
