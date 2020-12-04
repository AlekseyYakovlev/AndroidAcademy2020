package ru.spb.yakovlev.androidacademy2020.data

import ru.spb.yakovlev.androidacademy2020.model.MovieData
import ru.spb.yakovlev.androidacademy2020.model.MovieItemData
import ru.spb.yakovlev.androidacademy2020.model.toMovieItemData

object MovieListDummyRepo {

    val moviesList: MutableList<MovieData> = mutableListOf(
        MovieData(
            id = 1,
            title = "Avengers: End Game",
            tags = "Action, Adventure, Drama",
            duration = 137,
            pg = "13+",
            rating = 4f,
            reviewsCount = 125,
            poster = "https://s3-alpha-sig.figma.com/img/dc12/0ed4/1c9f714c6b87b83e8cc0932e0c8576f7?Expires=1607904000&Signature=O9GUiK6h8AwlJIpViG1zdziE3gUOKC5~4c9wp8id6aexT9Vnbbi6QXpg87U7Hju~aSoJ0VWzcgVQabTGu13sD5QDNIveDfrxrX6IvQxLFHZRSvKda-lY32Xw91r2hX-i5PK-6sJV3PRsaJXFkLyUVThlLNFS2CvpCaJPETwekukbmb-2yyifQ7Q4~hhC2rtFpcZX8Nycm~Gj4qGyQBIQce~FscIctsP5V1iV42zmLvUT4dXwK1s1xX5wGJo9dSNVqPgyMvYZAl-tPxh9Fx~ec3uXcruow0jXbY8tBq5PW4J~6hrWUWN1JqZ-6PRGXwjC4PGZ8B89yqttbk9a~d7ywg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/85f1/659d/0159882fd7d1a53192ba7e58f174971e?Expires=1607904000&Signature=QYHaspsVSUysIhCUUzeqoofe4Oz32F~~nIMo92I1VJEc61ST4iAkDFgtmZTT86IpPdShNm1yhl61la6~ZdIqbHaHX6a4iDw5lTigzZzNstnCAQBro5EhHRQNCvpV31GDWn2DawAu9l9GPyU3QzgbgiRvJqo8SFar9HkcejeXse65aMLtO8FaIGMiX1t-XSM~zshzfXvyr9a6-OHzcv-2muTUbUKqpta-T1IIu0ToGb7jfiORTLGhbBtjNKMOOPrPzQLiJBmDypXXZEqiRh551EAtd9rJFDJol2MhMtebmbfnR5Gdbij2QE4UPutlBExP9k8ldMidkNHh9-f5OkeCDQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "The main character is a secret agent who passes a cruel test of reliability and joins an incredible mission. The fate of the world depends on its implementation, and for success it is necessary to discard all previous ideas about space and time.",
            castIds = listOf(1, 2, 3, 4, 5, 6, 7, 8),
        ),
        MovieData(
            id = 2,
            title = "Tenet",
            tags = "Action, Sci-Fi, Thriller",
            duration = 97,
            pg = "16+",
            rating = 5f,
            reviewsCount = 98,
            poster = "https://s3-alpha-sig.figma.com/img/c1ed/9c57/1175fff3a3786edca69e746f7814f968?Expires=1607904000&Signature=bw~IghnLB0Ul~~wlbje6dohiMSUDd8fUDO9HQsCK2K1V01weAKGAU7rV91~634p-aJDZjslrQhOgxfGjKiqqs~w-JTwBuwUouQDeI73KGQ00EtU~ja8ybMcYgeUV4pK3scZDiM0Ch0h77QR1cpozHKae~7vpUEcvEDHzNtgyyqDKevAGMbkuh6W-JUJ~DwqLWfY0LbdJHyHKRI5f3w94sdKRgdQ21LtUugm4WVt~MWmuPaEoz8qkxpCIC6vXDRQKULrPoqVA72w~Ah~V~2bOikvAHUN6Zlq869-rgX40teYoxpKTt7xuY7F4ltlF0Iv34RK92AwDWQVSH8peQNSsAA__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/c1ed/9c57/1175fff3a3786edca69e746f7814f968?Expires=1607904000&Signature=bw~IghnLB0Ul~~wlbje6dohiMSUDd8fUDO9HQsCK2K1V01weAKGAU7rV91~634p-aJDZjslrQhOgxfGjKiqqs~w-JTwBuwUouQDeI73KGQ00EtU~ja8ybMcYgeUV4pK3scZDiM0Ch0h77QR1cpozHKae~7vpUEcvEDHzNtgyyqDKevAGMbkuh6W-JUJ~DwqLWfY0LbdJHyHKRI5f3w94sdKRgdQ21LtUugm4WVt~MWmuPaEoz8qkxpCIC6vXDRQKULrPoqVA72w~Ah~V~2bOikvAHUN6Zlq869-rgX40teYoxpKTt7xuY7F4ltlF0Iv34RK92AwDWQVSH8peQNSsAA__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = true,
            storyLine = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            castIds = listOf(8, 7, 6, 5, 4, 3, 2, 1),
        ),
        MovieData(
            id = 3,
            title = "Black Widow",
            tags = "Action, Adventure, Sci-Fi",
            duration = 102,
            pg = "13+",
            rating = 4f,
            reviewsCount = 1,
            poster = "https://s3-alpha-sig.figma.com/img/984e/8417/6361961de2f7a2eb504cdeec809d31b7?Expires=1607904000&Signature=V2p7KayNg2LelGkYzJAfllQHKm5RNLPz-825LtXUw1QhKtCCng8yWvbFIqRr36uQ3uII3x0fMRSiSKSS~hWWKv4IpvlSHkoCYyABQt~TYgKCeJJNwJrreQytG3AWWeIxmzFMDcVf4Fp8Ii-Zwc8E8HJKPda6Y8JM0QXlnJd-IdCtjxi~rjcDbDqdYfEYTifs5kM4dACcIue6oPfcAMjoWUMerew7U4ab9AeVTpft9n3W9vB8w55zduSmR79Le0zbaaPi~sLIS6i8042HpWb2o4bgdnvBsTt3Kw5wWFhv8DMQJz6~~uBE5pZMQJbztdKE6C0PcZWmX23P-TqXFQttmw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/984e/8417/6361961de2f7a2eb504cdeec809d31b7?Expires=1607904000&Signature=V2p7KayNg2LelGkYzJAfllQHKm5RNLPz-825LtXUw1QhKtCCng8yWvbFIqRr36uQ3uII3x0fMRSiSKSS~hWWKv4IpvlSHkoCYyABQt~TYgKCeJJNwJrreQytG3AWWeIxmzFMDcVf4Fp8Ii-Zwc8E8HJKPda6Y8JM0QXlnJd-IdCtjxi~rjcDbDqdYfEYTifs5kM4dACcIue6oPfcAMjoWUMerew7U4ab9AeVTpft9n3W9vB8w55zduSmR79Le0zbaaPi~sLIS6i8042HpWb2o4bgdnvBsTt3Kw5wWFhv8DMQJz6~~uBE5pZMQJbztdKE6C0PcZWmX23P-TqXFQttmw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            castIds = listOf(2, 1, 4, 3, 6, 5),
        ),
        MovieData(
            id = 4,
            title = "Wonder Woman 1984",
            tags = "Action, Adventure, Fantasy",
            duration = 120,
            pg = "13+",
            rating = 5f,
            reviewsCount = 74,
            poster = "https://s3-alpha-sig.figma.com/img/9b53/9e38/b80ee9fe84a6f1891904326a948c37c8?Expires=1607904000&Signature=cGtYnmUAOx2pUVVxGoe7QhrpSo36~hkixeiWK5ufZxqVI8IsfAmSqiulKbTb0I4myICJ3OQjd3y40AxmL-gUBKe~HctGBBy9BQg93dLHSlPFKuX4C8iNufoY~jr-jDIAK0T65NEj-UvLCfqVUpet~aoJdld1u8IwCjNFaNOuIK5~qu8UDZqzy9e0B4-gIlbRqt2w9Ev07VWcv0v3ggypVrntfvDIwKJBpwpNS35rKo24v~9IoE-kIWWnavmWzSk0GsdIQm5DUQnO~NWjWtz6J~COpUU5QNWc24hemtZZ32zl26YVwyCdc-aMN-yT~PPYsVwbje0tECjXUxTPgHm1QQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/9b53/9e38/b80ee9fe84a6f1891904326a948c37c8?Expires=1607904000&Signature=cGtYnmUAOx2pUVVxGoe7QhrpSo36~hkixeiWK5ufZxqVI8IsfAmSqiulKbTb0I4myICJ3OQjd3y40AxmL-gUBKe~HctGBBy9BQg93dLHSlPFKuX4C8iNufoY~jr-jDIAK0T65NEj-UvLCfqVUpet~aoJdld1u8IwCjNFaNOuIK5~qu8UDZqzy9e0B4-gIlbRqt2w9Ev07VWcv0v3ggypVrntfvDIwKJBpwpNS35rKo24v~9IoE-kIWWnavmWzSk0GsdIQm5DUQnO~NWjWtz6J~COpUU5QNWc24hemtZZ32zl26YVwyCdc-aMN-yT~PPYsVwbje0tECjXUxTPgHm1QQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "Continuation of the fantastic exploits of the Amazon warrior Diana, who left her secluded island to save humanity. After overcoming the tragedy of World War I, Wonder Woman is embroiled in a new international battle of the mid-1980s.",
            castIds = listOf(1, 5),
        ),
        MovieData(
            id = 5,
            title = "Iron Man 2",
            tags = "Action, Adventure, Fantasy",
            duration = 125,
            pg = "13+",
            rating = 5f,
            reviewsCount = 174,
            poster = "https://s3-alpha-sig.figma.com/img/2f12/2e11/04f6d7df0e52822c2dc88e175e279a90?Expires=1607904000&Signature=BLd45sCUbgKudAodFWWUCCVmnvbyPhUR2aWA~fUH48u0k~Ne8C5SN3C9TYUKpeimbT5-Tw~da6TqBNDJTz~0EbPGpcYOT6jyqw~ts-oi6ixgt2OLRTp7lWctjvMpzS8VKV6Rne5OQKeSc1rGJPfTb-bNS3zTeZ1M1q8-v3lhXDTQ5aMBEOWC-JLweJ05zu9pQBclrgUjRZwUlrHRH6MNJLaed9Ky9OxwCVvyz0DsBwiBDiPNXCgQ1HgRtn4zspuNBLenGUYZZNcZQ9bWlwqir7jh4dBbtG8V7e70rgQgyZuVnaT-V5GwcQlxHyTi30dPJVUnukqhwdNhJu2ALtIGHg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/2f12/2e11/04f6d7df0e52822c2dc88e175e279a90?Expires=1607904000&Signature=BLd45sCUbgKudAodFWWUCCVmnvbyPhUR2aWA~fUH48u0k~Ne8C5SN3C9TYUKpeimbT5-Tw~da6TqBNDJTz~0EbPGpcYOT6jyqw~ts-oi6ixgt2OLRTp7lWctjvMpzS8VKV6Rne5OQKeSc1rGJPfTb-bNS3zTeZ1M1q8-v3lhXDTQ5aMBEOWC-JLweJ05zu9pQBclrgUjRZwUlrHRH6MNJLaed9Ky9OxwCVvyz0DsBwiBDiPNXCgQ1HgRtn4zspuNBLenGUYZZNcZQ9bWlwqir7jh4dBbtG8V7e70rgQgyZuVnaT-V5GwcQlxHyTi30dPJVUnukqhwdNhJu2ALtIGHg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            castIds = listOf(1, 5),
        ),
        MovieData(
            id = 6,
            title = "Sherlock Holmes",
            tags = "Action, Adventure, Fantasy",
            duration = 100,
            pg = "13+",
            rating = 5f,
            reviewsCount = 115,
            poster = "https://s3-alpha-sig.figma.com/img/3bd6/ac9d/d8d1b62b748ed42d9e8593473b73ee8c?Expires=1607904000&Signature=ZuWSPEdsaUw32NoTMMwZMJP1Sg4CgTBSsgBO2FG67VsIxnCQopN6Bs8O0gCkFjlzKPZSVg-i3h-XC3RZAOvSfEE3bI39e4FcKavMTJSr2tMg125gi5MiJ4rmf0c91fWlgtzEviEogWTyG3WP~Pl6wXnEPs3D-XWaoTPNPc2dHd2DXEKbgVT73UdXZ7~c4BzVDMvijrGbv0g0adBRl1w7-BR2~djmY~TzgA6Rj4qBW0Y9ml0QdPEeHpa2qqlwvFQdQir0dpaW16DyEIVe4ldgRAd~3FFc9ZGpngMTZXnrnx1miOHNNN4wBnmjJkeuS8kt2~Mu~Ws9gU07wDkR6k1Njw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/3bd6/ac9d/d8d1b62b748ed42d9e8593473b73ee8c?Expires=1607904000&Signature=ZuWSPEdsaUw32NoTMMwZMJP1Sg4CgTBSsgBO2FG67VsIxnCQopN6Bs8O0gCkFjlzKPZSVg-i3h-XC3RZAOvSfEE3bI39e4FcKavMTJSr2tMg125gi5MiJ4rmf0c91fWlgtzEviEogWTyG3WP~Pl6wXnEPs3D-XWaoTPNPc2dHd2DXEKbgVT73UdXZ7~c4BzVDMvijrGbv0g0adBRl1w7-BR2~djmY~TzgA6Rj4qBW0Y9ml0QdPEeHpa2qqlwvFQdQir0dpaW16DyEIVe4ldgRAd~3FFc9ZGpngMTZXnrnx1miOHNNN4wBnmjJkeuS8kt2~Mu~Ws9gU07wDkR6k1Njw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            castIds = listOf(1, 5),
        ),
        MovieData(
            id = 7,
            title = "The Old Guard",
            tags = "Action, Sci-Fi, Thriller",
            duration = 84,
            pg = "16+",
            rating = 3f,
            reviewsCount = 115,
            poster = "https://s3-alpha-sig.figma.com/img/6282/08d2/597d1f527b90921df1f62b0811944332?Expires=1607904000&Signature=GZjoqBAH84i0zf0QKM2eLY8kaj7Ksh9eSsQg05EHmAo1jCOob9F-k~tl4IEK9EbF2CKb07sRm3f1duDQDJ0cMknMCr9bZqvKdq-IpEv2b3nJ6mq~jPgGjYQMbGp6oxKy5MN4tugeSAcFqjuCldN~ML8dfLKVxX7OfZmzndc7CC92pSFxgEvzOzhouYmAwqPdVjEWyryrJaHbjL7uAERw1i9Kbj8r0WQIiZrJs2jz3wi2DFoyoiSHS3GIFpU9C0htpivb0hc7wTu2uKWWepYGocIk2XxeWsaxjRpgX94gTwbSDh03c4kudcsW4PLRjsRdNcWOmpTcoi~Mw67arfcyzQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/6282/08d2/597d1f527b90921df1f62b0811944332?Expires=1607904000&Signature=GZjoqBAH84i0zf0QKM2eLY8kaj7Ksh9eSsQg05EHmAo1jCOob9F-k~tl4IEK9EbF2CKb07sRm3f1duDQDJ0cMknMCr9bZqvKdq-IpEv2b3nJ6mq~jPgGjYQMbGp6oxKy5MN4tugeSAcFqjuCldN~ML8dfLKVxX7OfZmzndc7CC92pSFxgEvzOzhouYmAwqPdVjEWyryrJaHbjL7uAERw1i9Kbj8r0WQIiZrJs2jz3wi2DFoyoiSHS3GIFpU9C0htpivb0hc7wTu2uKWWepYGocIk2XxeWsaxjRpgX94gTwbSDh03c4kudcsW4PLRjsRdNcWOmpTcoi~Mw67arfcyzQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "\"The Old Guard\" is the story of old soldiers who never die, and yet cannot seem to fade away. Trapped in an immortality without explanation, Andromache of Scythia 'Andy' and her comrades ply their trade for those who can find-and afford-their services.",
            castIds = listOf(2, 8),
        ),
        MovieData(
            id = 8,
            title = "Avengers: End Game",
            tags = "Action, Adventure, Drama",
            duration = 137,
            pg = "13+",
            rating = 4f,
            reviewsCount = 125,
            poster = "https://s3-alpha-sig.figma.com/img/dc12/0ed4/1c9f714c6b87b83e8cc0932e0c8576f7?Expires=1607904000&Signature=O9GUiK6h8AwlJIpViG1zdziE3gUOKC5~4c9wp8id6aexT9Vnbbi6QXpg87U7Hju~aSoJ0VWzcgVQabTGu13sD5QDNIveDfrxrX6IvQxLFHZRSvKda-lY32Xw91r2hX-i5PK-6sJV3PRsaJXFkLyUVThlLNFS2CvpCaJPETwekukbmb-2yyifQ7Q4~hhC2rtFpcZX8Nycm~Gj4qGyQBIQce~FscIctsP5V1iV42zmLvUT4dXwK1s1xX5wGJo9dSNVqPgyMvYZAl-tPxh9Fx~ec3uXcruow0jXbY8tBq5PW4J~6hrWUWN1JqZ-6PRGXwjC4PGZ8B89yqttbk9a~d7ywg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/dc12/0ed4/1c9f714c6b87b83e8cc0932e0c8576f7?Expires=1607904000&Signature=O9GUiK6h8AwlJIpViG1zdziE3gUOKC5~4c9wp8id6aexT9Vnbbi6QXpg87U7Hju~aSoJ0VWzcgVQabTGu13sD5QDNIveDfrxrX6IvQxLFHZRSvKda-lY32Xw91r2hX-i5PK-6sJV3PRsaJXFkLyUVThlLNFS2CvpCaJPETwekukbmb-2yyifQ7Q4~hhC2rtFpcZX8Nycm~Gj4qGyQBIQce~FscIctsP5V1iV42zmLvUT4dXwK1s1xX5wGJo9dSNVqPgyMvYZAl-tPxh9Fx~ec3uXcruow0jXbY8tBq5PW4J~6hrWUWN1JqZ-6PRGXwjC4PGZ8B89yqttbk9a~d7ywg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "The main character is a secret agent who passes a cruel test of reliability and joins an incredible mission. The fate of the world depends on its implementation, and for success it is necessary to discard all previous ideas about space and time.",
            castIds = listOf(1, 2, 3, 4, 5, 6, 7, 8),
        ),
        MovieData(
            id = 9,
            title = "Tenet",
            tags = "Action, Sci-Fi, Thriller",
            duration = 97,
            pg = "16+",
            rating = 5f,
            reviewsCount = 98,
            poster = "https://s3-alpha-sig.figma.com/img/c1ed/9c57/1175fff3a3786edca69e746f7814f968?Expires=1607904000&Signature=bw~IghnLB0Ul~~wlbje6dohiMSUDd8fUDO9HQsCK2K1V01weAKGAU7rV91~634p-aJDZjslrQhOgxfGjKiqqs~w-JTwBuwUouQDeI73KGQ00EtU~ja8ybMcYgeUV4pK3scZDiM0Ch0h77QR1cpozHKae~7vpUEcvEDHzNtgyyqDKevAGMbkuh6W-JUJ~DwqLWfY0LbdJHyHKRI5f3w94sdKRgdQ21LtUugm4WVt~MWmuPaEoz8qkxpCIC6vXDRQKULrPoqVA72w~Ah~V~2bOikvAHUN6Zlq869-rgX40teYoxpKTt7xuY7F4ltlF0Iv34RK92AwDWQVSH8peQNSsAA__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/c1ed/9c57/1175fff3a3786edca69e746f7814f968?Expires=1607904000&Signature=bw~IghnLB0Ul~~wlbje6dohiMSUDd8fUDO9HQsCK2K1V01weAKGAU7rV91~634p-aJDZjslrQhOgxfGjKiqqs~w-JTwBuwUouQDeI73KGQ00EtU~ja8ybMcYgeUV4pK3scZDiM0Ch0h77QR1cpozHKae~7vpUEcvEDHzNtgyyqDKevAGMbkuh6W-JUJ~DwqLWfY0LbdJHyHKRI5f3w94sdKRgdQ21LtUugm4WVt~MWmuPaEoz8qkxpCIC6vXDRQKULrPoqVA72w~Ah~V~2bOikvAHUN6Zlq869-rgX40teYoxpKTt7xuY7F4ltlF0Iv34RK92AwDWQVSH8peQNSsAA__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = true,
            storyLine = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            castIds = listOf(8, 7, 6, 5, 4, 3, 2, 1),
        ),
        MovieData(
            id = 10,
            title = "Black Widow",
            tags = "Action, Adventure, Sci-Fi",
            duration = 102,
            pg = "13+",
            rating = 4f,
            reviewsCount = 38,
            poster = "https://s3-alpha-sig.figma.com/img/984e/8417/6361961de2f7a2eb504cdeec809d31b7?Expires=1607904000&Signature=V2p7KayNg2LelGkYzJAfllQHKm5RNLPz-825LtXUw1QhKtCCng8yWvbFIqRr36uQ3uII3x0fMRSiSKSS~hWWKv4IpvlSHkoCYyABQt~TYgKCeJJNwJrreQytG3AWWeIxmzFMDcVf4Fp8Ii-Zwc8E8HJKPda6Y8JM0QXlnJd-IdCtjxi~rjcDbDqdYfEYTifs5kM4dACcIue6oPfcAMjoWUMerew7U4ab9AeVTpft9n3W9vB8w55zduSmR79Le0zbaaPi~sLIS6i8042HpWb2o4bgdnvBsTt3Kw5wWFhv8DMQJz6~~uBE5pZMQJbztdKE6C0PcZWmX23P-TqXFQttmw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/984e/8417/6361961de2f7a2eb504cdeec809d31b7?Expires=1607904000&Signature=V2p7KayNg2LelGkYzJAfllQHKm5RNLPz-825LtXUw1QhKtCCng8yWvbFIqRr36uQ3uII3x0fMRSiSKSS~hWWKv4IpvlSHkoCYyABQt~TYgKCeJJNwJrreQytG3AWWeIxmzFMDcVf4Fp8Ii-Zwc8E8HJKPda6Y8JM0QXlnJd-IdCtjxi~rjcDbDqdYfEYTifs5kM4dACcIue6oPfcAMjoWUMerew7U4ab9AeVTpft9n3W9vB8w55zduSmR79Le0zbaaPi~sLIS6i8042HpWb2o4bgdnvBsTt3Kw5wWFhv8DMQJz6~~uBE5pZMQJbztdKE6C0PcZWmX23P-TqXFQttmw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            castIds = listOf(2, 1, 4, 3, 6, 5),
        ),
        MovieData(
            id = 11,
            title = "Wonder Woman 1984",
            tags = "Action, Adventure, Fantasy",
            duration = 120,
            pg = "13+",
            rating = 5f,
            reviewsCount = 74,
            poster = "https://s3-alpha-sig.figma.com/img/9b53/9e38/b80ee9fe84a6f1891904326a948c37c8?Expires=1607904000&Signature=cGtYnmUAOx2pUVVxGoe7QhrpSo36~hkixeiWK5ufZxqVI8IsfAmSqiulKbTb0I4myICJ3OQjd3y40AxmL-gUBKe~HctGBBy9BQg93dLHSlPFKuX4C8iNufoY~jr-jDIAK0T65NEj-UvLCfqVUpet~aoJdld1u8IwCjNFaNOuIK5~qu8UDZqzy9e0B4-gIlbRqt2w9Ev07VWcv0v3ggypVrntfvDIwKJBpwpNS35rKo24v~9IoE-kIWWnavmWzSk0GsdIQm5DUQnO~NWjWtz6J~COpUU5QNWc24hemtZZ32zl26YVwyCdc-aMN-yT~PPYsVwbje0tECjXUxTPgHm1QQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/9b53/9e38/b80ee9fe84a6f1891904326a948c37c8?Expires=1607904000&Signature=cGtYnmUAOx2pUVVxGoe7QhrpSo36~hkixeiWK5ufZxqVI8IsfAmSqiulKbTb0I4myICJ3OQjd3y40AxmL-gUBKe~HctGBBy9BQg93dLHSlPFKuX4C8iNufoY~jr-jDIAK0T65NEj-UvLCfqVUpet~aoJdld1u8IwCjNFaNOuIK5~qu8UDZqzy9e0B4-gIlbRqt2w9Ev07VWcv0v3ggypVrntfvDIwKJBpwpNS35rKo24v~9IoE-kIWWnavmWzSk0GsdIQm5DUQnO~NWjWtz6J~COpUU5QNWc24hemtZZ32zl26YVwyCdc-aMN-yT~PPYsVwbje0tECjXUxTPgHm1QQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "Continuation of the fantastic exploits of the Amazon warrior Diana, who left her secluded island to save humanity. After overcoming the tragedy of World War I, Wonder Woman is embroiled in a new international battle of the mid-1980s.",
            castIds = listOf(1, 5),
        ),
        MovieData(
            id = 12,
            title = "Iron Man 2",
            tags = "Action, Adventure, Fantasy",
            duration = 125,
            pg = "13+",
            rating = 5f,
            reviewsCount = 174,
            poster = "https://s3-alpha-sig.figma.com/img/2f12/2e11/04f6d7df0e52822c2dc88e175e279a90?Expires=1607904000&Signature=BLd45sCUbgKudAodFWWUCCVmnvbyPhUR2aWA~fUH48u0k~Ne8C5SN3C9TYUKpeimbT5-Tw~da6TqBNDJTz~0EbPGpcYOT6jyqw~ts-oi6ixgt2OLRTp7lWctjvMpzS8VKV6Rne5OQKeSc1rGJPfTb-bNS3zTeZ1M1q8-v3lhXDTQ5aMBEOWC-JLweJ05zu9pQBclrgUjRZwUlrHRH6MNJLaed9Ky9OxwCVvyz0DsBwiBDiPNXCgQ1HgRtn4zspuNBLenGUYZZNcZQ9bWlwqir7jh4dBbtG8V7e70rgQgyZuVnaT-V5GwcQlxHyTi30dPJVUnukqhwdNhJu2ALtIGHg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/2f12/2e11/04f6d7df0e52822c2dc88e175e279a90?Expires=1607904000&Signature=BLd45sCUbgKudAodFWWUCCVmnvbyPhUR2aWA~fUH48u0k~Ne8C5SN3C9TYUKpeimbT5-Tw~da6TqBNDJTz~0EbPGpcYOT6jyqw~ts-oi6ixgt2OLRTp7lWctjvMpzS8VKV6Rne5OQKeSc1rGJPfTb-bNS3zTeZ1M1q8-v3lhXDTQ5aMBEOWC-JLweJ05zu9pQBclrgUjRZwUlrHRH6MNJLaed9Ky9OxwCVvyz0DsBwiBDiPNXCgQ1HgRtn4zspuNBLenGUYZZNcZQ9bWlwqir7jh4dBbtG8V7e70rgQgyZuVnaT-V5GwcQlxHyTi30dPJVUnukqhwdNhJu2ALtIGHg__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            castIds = listOf(1, 5),
        ),
        MovieData(
            id = 13,
            title = "Sherlock Holmes",
            tags = "Action, Adventure, Fantasy",
            duration = 100,
            pg = "13+",
            rating = 5f,
            reviewsCount = 115,
            poster = "https://s3-alpha-sig.figma.com/img/3bd6/ac9d/d8d1b62b748ed42d9e8593473b73ee8c?Expires=1607904000&Signature=ZuWSPEdsaUw32NoTMMwZMJP1Sg4CgTBSsgBO2FG67VsIxnCQopN6Bs8O0gCkFjlzKPZSVg-i3h-XC3RZAOvSfEE3bI39e4FcKavMTJSr2tMg125gi5MiJ4rmf0c91fWlgtzEviEogWTyG3WP~Pl6wXnEPs3D-XWaoTPNPc2dHd2DXEKbgVT73UdXZ7~c4BzVDMvijrGbv0g0adBRl1w7-BR2~djmY~TzgA6Rj4qBW0Y9ml0QdPEeHpa2qqlwvFQdQir0dpaW16DyEIVe4ldgRAd~3FFc9ZGpngMTZXnrnx1miOHNNN4wBnmjJkeuS8kt2~Mu~Ws9gU07wDkR6k1Njw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/3bd6/ac9d/d8d1b62b748ed42d9e8593473b73ee8c?Expires=1607904000&Signature=ZuWSPEdsaUw32NoTMMwZMJP1Sg4CgTBSsgBO2FG67VsIxnCQopN6Bs8O0gCkFjlzKPZSVg-i3h-XC3RZAOvSfEE3bI39e4FcKavMTJSr2tMg125gi5MiJ4rmf0c91fWlgtzEviEogWTyG3WP~Pl6wXnEPs3D-XWaoTPNPc2dHd2DXEKbgVT73UdXZ7~c4BzVDMvijrGbv0g0adBRl1w7-BR2~djmY~TzgA6Rj4qBW0Y9ml0QdPEeHpa2qqlwvFQdQir0dpaW16DyEIVe4ldgRAd~3FFc9ZGpngMTZXnrnx1miOHNNN4wBnmjJkeuS8kt2~Mu~Ws9gU07wDkR6k1Njw__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "After the devastating events of Avengers: Infinity War, the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            castIds = listOf(1, 5),
        ),
        MovieData(
            id = 14,
            title = "The Old Guard",
            tags = "Action, Sci-Fi, Thriller",
            duration = 84,
            pg = "16+",
            rating = 3f,
            reviewsCount = 115,
            poster = "https://s3-alpha-sig.figma.com/img/6282/08d2/597d1f527b90921df1f62b0811944332?Expires=1607904000&Signature=GZjoqBAH84i0zf0QKM2eLY8kaj7Ksh9eSsQg05EHmAo1jCOob9F-k~tl4IEK9EbF2CKb07sRm3f1duDQDJ0cMknMCr9bZqvKdq-IpEv2b3nJ6mq~jPgGjYQMbGp6oxKy5MN4tugeSAcFqjuCldN~ML8dfLKVxX7OfZmzndc7CC92pSFxgEvzOzhouYmAwqPdVjEWyryrJaHbjL7uAERw1i9Kbj8r0WQIiZrJs2jz3wi2DFoyoiSHS3GIFpU9C0htpivb0hc7wTu2uKWWepYGocIk2XxeWsaxjRpgX94gTwbSDh03c4kudcsW4PLRjsRdNcWOmpTcoi~Mw67arfcyzQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            poster2 = "https://s3-alpha-sig.figma.com/img/6282/08d2/597d1f527b90921df1f62b0811944332?Expires=1607904000&Signature=GZjoqBAH84i0zf0QKM2eLY8kaj7Ksh9eSsQg05EHmAo1jCOob9F-k~tl4IEK9EbF2CKb07sRm3f1duDQDJ0cMknMCr9bZqvKdq-IpEv2b3nJ6mq~jPgGjYQMbGp6oxKy5MN4tugeSAcFqjuCldN~ML8dfLKVxX7OfZmzndc7CC92pSFxgEvzOzhouYmAwqPdVjEWyryrJaHbjL7uAERw1i9Kbj8r0WQIiZrJs2jz3wi2DFoyoiSHS3GIFpU9C0htpivb0hc7wTu2uKWWepYGocIk2XxeWsaxjRpgX94gTwbSDh03c4kudcsW4PLRjsRdNcWOmpTcoi~Mw67arfcyzQ__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
            isLike = false,
            storyLine = "\"The Old Guard\" is the story of old soldiers who never die, and yet cannot seem to fade away. Trapped in an immortality without explanation, Andromache of Scythia 'Andy' and her comrades ply their trade for those who can find-and afford-their services.",
            castIds = listOf(2, 8),
        ),
    )

    //val movieItemList: List<MovieItemData> = moviesList.map { it.toMovieItemData() }

    fun getMovieItemList(): List<MovieItemData> = moviesList.map { it.toMovieItemData() }

    fun getMovieById(moveId: Int): MovieData = moviesList.find { it.id == moveId } ?: moviesList[0]

    fun updateMovieLike(moveId: Int, isLike: Boolean) {
        val oldCopy = getMovieById(moveId)
        val index = moviesList.indexOf(oldCopy)
        moviesList[index] = oldCopy.copy(isLike = isLike)
    }
}