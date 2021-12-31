Web = Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
JPA = Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
Validation = Bean Validation with Hibernate validator.
H2 = Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
DevTools = Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
Thymeleaf = A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.


Etape 13 :

1) @GetMapping("/greeting")

2) return "greeting";

3) On récupère le nom dans l'URL avec nameGET. On le sauvegarde dans un attribut du modèle utilisable dans la page greeting.html

Etape 17 et 18 :

On trouve une table Address dans la base de donnée. Elle a été créée à partir de la balise @Entity dans la classe Address

Etape 20 :
On obtient le résultat suivant après la commande "SELECT * FROM ADDRESS;"

1	57 boulevard demorieux	2021-11-05 17:46:26.302468
2	51 allee du gamay, 34080 montpellier	2021-11-05 17:46:26.3206

Etape 23 :

@Autowired nous permet de ne pas mettre de getter et de setter. L'annotation va permettre de faire la dependance
entre les objets implicitement

Etape 30 :

On ajoute Bootstrap en ajoutant une dépendance dans le fichier pom.xml


Partie II

Etape 6 : On a besoin d'une clé API pour utiliser Meteo Concept. Celle-ci possède un certain nombre d'utilisation par jour.
On doit entrer l'URL suivante https://api.meteo-concept.com/api/forecast/nextHours?token=MON_TOKEN suivi de différent paramètre pour préciser la recherche comme par exemple en insérant "&insee=77067" pour indiquer le numéro insee d'une ville précise.
La température peut être trouvé dans une collection d'objets de type forecast-period appelée forecast.
