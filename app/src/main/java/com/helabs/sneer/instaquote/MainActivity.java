package com.helabs.sneer.instaquote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends Activity {

	private static String[] INSPIRATIONAL = {
			"\"Start by doing what's necessary; then do what's possible; and suddenly you are doing the impossible.\"\n - Francis of Assisi",
			"\"The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.\"\n - Helen Keller",
			"\"Perfection is not attainable, but if we chase perfection we can catch excellence.\"\n - Vince Lombardi",
			"\"I can't change the direction of the wind, but I can adjust my sails to always reach my destination.\"\n - Jimmy Dean",
			"\"Nothing is impossible, the word itself says 'I'm possible'!\"\n - Audrey Hepburn",
			"\"Try to be a rainbow in someone's cloud.\"\n - Maya Angelou",
			"\"We know what we are, but know not what we may be.\"\n - William Shakespeare",
			"\"Put your heart, mind, and soul into even your smallest acts. This is the secret of success.\"\n - Swami Sivananda",
			"\"Today I choose life. Every morning when I wake up I can choose joy, happiness, negativity, pain... To feel the freedom that comes from being able to continue to make mistakes and choices - today I choose to feel life, not to deny my humanity but embrace it.\"\n - Kevyn Aucoin",
			"\"Believe you can and you're halfway there.\"\n - Theodore Roosevelt",
			"\"It is during our darkest moments that we must focus to see the light.\"\n - Aristotle Onassis",
			"\"My mission in life is not merely to survive, but to thrive; and to do so with some passion, some compassion, some humor, and some style.\"\n - Maya Angelou",
			"\"Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it.\"\n - Steve Jobs",
			"\"Change your thoughts and you change your world.\"\n - Norman Vincent Peale",
			"\"My sun sets to rise again.\"\n - Elizabeth Barrett Browning",
			"\"I believe in pink. I believe that laughing is the best calorie burner. I believe in kissing, kissing a lot. I believe in being strong when everything seems to be going wrong. I believe that happy girls are the prettiest girls. I believe that tomorrow is another day and I believe in miracles.\"\n - Audrey Hepburn",
			"\"As we express our gratitude, we must never forget that the highest appreciation is not to utter words, but to live by them.\"\n - John F. Kennedy",
			"\"Health is the greatest gift, contentment the greatest wealth, faithfulness the best relationship.\n - Buddha",
			"\"We can't help everyone, but everyone can help someone.\"\n - Ronald Reagan",
			"\"Don't judge each day by the harvest you reap but by the seeds that you plant.\"\n - Robert Louis Stevenson",
			"\"Whoever is happy will make others happy too.\"\n - Anne Frank",
			"\"The measure of who we are is what we do with what we have.\"\n - Vince Lombardi",
			"\"I hated every minute of training, but I said, 'Don't quit. Suffer now and live the rest of your life as a champion.'\"\n - Muhammad Ali",
			"\"Don't limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve.\"\n - Mary Kay Ash",
			"\"There are two ways of spreading light: to be the candle or the mirror that reflects it.\"\n - Edith Wharton",
			"\"Who would have thought that a tap-dancing penguin would outpoint James Bond at the box office? And deserve to? Not that there's anything wrong with 'Casino Royale.' But 'Happy Feet' - written and directed by George Miller - is a complete charmer, even if, in the way of most family fare, it can't resist straying into the Inspirational.\"\n - Robert Gottlieb",
			"\"I want to be motivational and inspirational for everybody: my big aim is more women on bicycles.\"\n - Marianne Vos",
			"\"Just as you wouldn't leave the house without taking a shower, you shouldn't start the day without at least 10 minutes of sacred practice: prayer, meditation, inspirational reading.\"\n - Marianne Williamson",
			"\"I think anyone who has a passion for what they love to do, and who pursue it, is inspirational for me.\"\n - Colin Morgan",
			"\"There are thousands of inspirational stories waiting to be told about young women who yearn for a great education. They are stories of struggle and stories of success, and they will inspire others to take action and work to change lives.\"\n - Soledad O'Brien",
			"\"I really think that it's disgusting that Paris is the only place where it is illegal for paps to follow you around. It actually took someone losing their life - Diana, an inspirational woman - and then it changed, but they still won't change it in London! It's horrible!\"\n - Cara Delevingne",
			"\"Star Wars is fun, its exciting, its inspirational, and people respond to that. It's what they want.\"\n - George Lucas",
			"\"Architecture is not an inspirational business, it's a rational procedure to do sensible and hopefully beautiful things; that's all.\"\n - Harry Seidler",
			"\"What they have done in Japan, which I find so inspirational, is they've brought the toilet out from behind the locked door. They've made it conversational. People go out and upgrade their toilet. They talk about it. They've sanitized it.\"\n - Rose George",
			"\"If my writing comes to a halt, I head to the shops: I find them very inspirational. And if I get into real trouble with my plot, I go out for a pizza with my husband.\"\n - Sophie Kinsella",
			"\"By now, you've probably caught on to something: my mother is always standing by with just the right Scripture or inspirational saying to get me through any tough situation.\"\n - Gabby Douglas",
			"\"So I wanted to sing inspirational music, and that's exactly how I approached it - only the words have been changed to declare my relationship with God.\"\n - Smokey Robinson",
			"\"This CD became something of a personal journey for me. The tone of the whole CD is uplifting and inspirational. It's an upper. We have enough downers in the world.\"\n - Roma Downey",
			"\"Since we launched the original 'Pop Idol' in England, I've remained close with Simon Fuller. Working as executive producer on 'American idol' for its first seven years not only was an inspirational journey into the heart of American pop culture, it opened my eyes to the untapped potential of the incredibly dynamic young people in this world.\"\n - Nigel Lythgoe",
			"\"'Do What You Gotta Do' is a positive, inspirational song that says no matter what it is; whether you're up against challenges or trying to get your dreams and aspirations met, you should do what whatever you have to do shy of killing yourself or someone else.\"\n - Angie Stone",
			"\"It's inspirational to see someone who is dying smile.\"\n - Arlen Specter",
			"\"Even though gospel music is going into a different area and arena from just being gospel to being inspirational, entertainment, if you will, I think that we still need to make sure that we keep our message crystal clear. Because the gospel is good news, and if we're not sharing good news, we're not doing what we're supposed to do as gospel artists.\"\n - Marvin Sapp",
			"\"Like the United Nations, there is something inspirational about New York as a great melting pot of different cultures and traditions. And if this is the city that never sleeps, the United Nations works tirelessly, around the clock around the world.\"\n - Ban Ki-moon",
			"\"Barack Obama's inspirational whoosh to the presidency in 2008 was unusual. Most campaigns are less exhilarating; indeed, they are downright disappointing - until someone wins.\"\n - Joe Klein",
			"\"I think that's a great opportunity, to pick a script where you can build up a good skill. I think the main thing I look for when I look at scripts is if it's inspirational. If it's something that teenagers can relate to. And is it something that the audience is going to get something out of. If not, then it's really not worth doing.\"\n - Carly Schroeder",
			"\"I would say I'm an inspirational guidelines book. You can take my life story or scenarios or songs and relate to them and apply them to your everyday life.\"\n - Chris Brown",
			"\"You never know when some small thing will lead to a big idea. Travel is very inspirational - but it's in the ordinary that I find my themes of love and work and family.\"\n - Adriana Trigiani",
			"\"I think 'Heroes of Cosplay' will show a lot of the positive things, like how much effort it takes to make a costume. These people on the show aren't taking shortcuts. As long as that effort gets through to the viewers, we will be inspirational. Then there will be people who watch the show that want to get in and hands-on make outfits.\"\n - Yaya Han",
			"\"I used to make up stuff in my bio all the time, that I used to be a professional ice-skater and stuff like that. I found it so inspirational. Why not make myself cooler than I am?\"\n - Stephen Colbert",
			"\"Traveling around the country, meeting fans and hearing their stories in person and on my radio show has reenergized my commitment to creating honest and inspirational content that not only serves my own creative purposes but can help and touch others as well.\"\n - Nikki Sixx",
			"\"I believe in the city as a natural human environment, but we must humanize it. It's art that will re-define public space in the 21st Century. We can make our cities diverse, inspirational places by putting art, dance and performance in all its forms into the matrix of street life.\"\n - Antony Gormley",
			"\"I had an inspirational teacher at my junior school: Peter Nixon. He was enthusiastic, knowledgeable and slightly scary - a good combination for a teacher.\"\n - Stephen Mangan",
			"\"The single most important thing in a child's performance is the quality of the teacher. Making sure a child spends the maximum amount of time with inspirational teachers is the most important thing.\"\n - Michael Gove",
			"\"I have amazing friends who have led inspirational lives.\"\n - Andrew Shue",
			"\"Teachers need to be more inspirational. But it's also up to engineering to make itself more interesting.\"\n - Bruce Dickinson",
			"\"The leaders who we admire who have been able to bring great change in the past - Gandhi, Martin Luther King, Nelson Mandela - they're all inspirational religious leaders and smart tacticians. It would be nice to find the Muslim Gandhi, wouldn't it?\"\n - Dennis C. Blair",
			"\"I think the end goal, hopefully, is to take advantage of the attention I've gotten along the way and use it for good and build some communities, and as I get older I can continue to do things and be surrounded by things that are inspirational to me.\"\n - Reggie Watts",
			"\"Reading was very important to me as a kid. It was very inspirational to me. I went to a school where that wasn't encouraged so much, but my parents encouraged that, and it has made me part of who I am.\"\n - Sasha Grey",
			"\"If you look at a building by Mies van der Rohe, it might look very simple, but up close, the sheer quality of construction, materials and thought are inspirational.\"\n - David Chipperfield",
			"\"I had hoped when my life was chronicled, it would be an inspirational story.\"\n - Om Puri",
			"\"I want to be an inspirational model. I want people to look at me and say, 'Wow, she looks healthy.'\"\n - Ireland Baldwin",
			"\"President Obama called for a 'we' nation in his Inauguration Address. Art convenes. It is not just inspirational. It is aspirational. It pricks the walls of our compartmentalized minds, opens our hearts and makes us brave. And that's what we need most in our country today.\"\n - Anna Deavere Smith",
			"\"Almost every college playwright or sketch or improv comedian was sort of aware of Christopher Durang - even kids in high school. His short plays were so accessible to younger people and I think that was inspirational to me.\"\n - Mindy Kaling",
			"\"I do a lot of inspirational talks for kids, to motivate them to change their lives and give them hope.\"\n - Adam Beach",
			"\"I'm not an inspirational quote kind of person.\"\n - Christine Teigen",
			"\"When Maurice touched a keyboard, it was like something from a movie, magical. He would always give you something from a movie, and you'd go, what did you just play... immediately inspirational writings, amazing. That's what we're going to miss.\"\n - Robin Gibb",
			"\"I love a lot of the New York bands, but Patti Smith stands out. I just read 'Just Kids' and it's an inspirational, well-written account of an emerging New York artist in the late seventies.\"\n - James Iha",
			"\"I will always desire to play with Bruce Springsteen. He's the most inspirational, most dedicated, most committed and most focused artist I've ever seen. I like to be around people like that.\"\n - Max Weinberg",
			"\"In sports teams, apart from talk of sporting prowess and the imparting of inspirational thought, an extraordinary amount of time is spent discussing, and flaunting, material possessions.\"\n - Harsha Bhogle",
			"\"A lot of America is kind of done. People have been making films about it for 100 years. Everything to me feels used up. But Jo-Burg feels unbelievably inspirational to me.\"\n - Neill Blomkamp",
			"\"I did an A Level in Theatre Studies and had a really inspirational teacher, and then I just went on to university.\"\n - Jessica Raine",
			"\"It is such a luxury to open a new book that's highly recommended by friends - either an inspirational yet humorously self-deprecating memoir, or a page-turning piece of fiction.\"\n - Kelli O'Hara",
			"\"I think, aesthetically, car design is so interesting - the dashboards, the steering wheels, and the beauty of the mechanics. I don't know how any of it works, I don't want to know, but it's inspirational.\"\n - Paloma Picasso",
			"\"Space is an inspirational concept that allows you to dream big.\"\n - Peter Diamandis",
			"\"Rap music's been around for too long now to be inspirational. The words are, but the music isn't.\n - Alexander McQueen",
			"\"The best form of flattery is to be admired, imitated or respected. I've always felt proud our fans look up to us or feel we are inspirational.\"\n - Cheryl James",
			"\"I view art as an inspirational tool.\"\n - Thomas Kincade",
			"\"I do love to eavesdrop. It's inspirational, not only for subject matter but for actual dialogue, the way people talk.\"\n - Lynda Barry",
			"\"Books are challenging and inspirational to me.\"\n - Amy Sedaris",
			"\"I think that the reason for my success is that I am really not aspirational. I am inspirational in that the people at home feel like they can really relate to me.\"\n - Rosie O'Donnell",
			"\"I wanted to do something inspirational for my children.\"\n - Harvey Weinstein",
			"\"I think if there's something one needs to change with oneself, it doesn't have to happen in the New Year. You can do that any time you please - not that it's not a good inspirational tactic for the people that it works for.\"\n - Brittany Murphy",
			"\"Every song you're trying to find something that going to connect in different ways but for me the songs that I'm really drawn to are inspirational, songs that lift you and that everybody can relate to no matter where you're from.\"\n - Rodney Atkins",
			"\"I am very conscious of who I am as an artist and as an inspirational person.\"\n - R. Kelly",
			"\"Lady Gaga is the present and the future. She is the most revolutionary and inspirational artist. She is fearless and daring.\"\n - Donatella Versace",
			"\"Growing up, in church we had the homily; at home it's what I call the 'momily' - the inspirational and instructive mom-isms that every family has.\"\n - Christine Pelosi",
			"\"Benazir Bhutto was an inspirational leader and an inspirational woman.\"\n - Malala Yousafzai",
			"\"All my music is inspirational. You just gotta listen to the words and get what you can get out of it.\"\n - Young Jeezy",
			"\"We all obviously need others to look up to, and be inspirational to us. Ford did a great job as far as putting the presidency back where it belonged, getting the trust back after Nixon. And President Reagan has been one of the most influential presidents.\"\n - Steve Garvey",
			"\"Lee's great gifts are teaching and inspirational guidance, not administration and management.\"\n - Cheryl Crawford",
			"\"Roosevelt's declaration that Americans had 'nothing to fear but fear itself' was a glorious piece of inspirational rhetoric and just as gloriously wrong.\"\n - Russell Baker",
			"\"There have been many different artists that have been inspirational. I suppose the question is directed to what was the reason why I went into fantasy illustration.\"\n - Boris Vallejo",
			"\"I wrote '('Til) I Kissed You' about a girl I met in Australia. Her name was Lilian, and she was very, very inspirational. I was married, but... I wrote the song about her on the way back home.\"\n - Don Everly",
			"\"I grew up in a bookless house - my parents didn't read poetry, so if I hadn't had the chance to experience it at school I'd never have experienced it. But I loved English, and I was very lucky in that I had inspirational English teachers, Miss Scriven and Mr. Walker, and they liked us to learn poems by heart, which I found I loved doing.\"\n - Carol Ann Duffy",
			"\"The flow of Guiness into the studio was inspirational as well as nutritive.\"\n - Carter Burwell",
			"\"I love inspirational R&B, like Mary J. Blige and Jennifer Hudson. I want to do that. That kind of music stays with you.\"\n - Ashthon Jones",
			"\"Had I not come out with an inspirational CD, you perhaps would have never known that I feel like I feel, that all songs, all the music I've ever done is a gift from God.\"\n - Smokey Robinson",
			"\"In fact, I wouldn't really call this a Gospel album, I call it more an inspirational album.\"\n - Smokey Robinson",
			"\"My tastes and inspirational artists were always rather eclectic and diverse.\"\n - Taylor Dayne",
			"\"I've done a lot of albums and I kinda know when I'm onto something that was inspirational for me to record and create, and this was one of those projects where I really enjoyed making the album.\"\n - Lee Ritenour",
			"\"I hope that at the end of the seven years, people will say that I have been of some inspirational value to them at home in terms of inclusiveness and abroad, I look forward to representing Ireland.\"\n - Michael D. Higgins",
			"\"Deacon Jones has been the most inspirational person in my football career.\"\n - Jack Youngblood",
			"\"My father, Oliver Hynes, was an educator. He was originally just a teacher, a very good one, but then he was promoted to be in charge of education for the entire area. He was always an inspirational teacher. He was my big personal supporter, always coming here for the Tony Awards. My mother, Carmel, was a homemaker.\"\n - Garry Hynes",
			"\"I would probably work with Drake as he is massively inspirational to me as a writer as well as an artist. If not him, then Susan Boyle!\"\n - Conor Maynard",
			"\"I do like alternative rock and rap, but as far as inspirational, then I go full-on orchestra. It fills up your entire being.\"\n - Osric Chau",
			"\"Personally, I can't see the appeal in trekking down to D.C. for a networking extravaganza, even if it is built around a special moment in American history. While I find the election of Barack Obama inspirational, I don't have a desire to memorialize it with overly effusive celebration.\"\n - Jamie Johnson",
			"\"I'm very fond of the British cinema. I'm a big fan of Martin Campbell and Daniel Craig. I actually find Daniel very inspirational, especially on the physical side of things. He really inspired me to get back into shape when I started to add on a few pounds. I think he's a great role model.\"\n - Steven Bauer",
			"\"We sing inspirational songs, songs of praise and worship, and about how good and how big God is. We are magnifying the Lord.\"\n - Fred Hammond",
			"\"I thought 'Moulin Rouge' was inspirational, and 'Jesus Christ Superstar' I loved.\"\n - Pierce Brosnan",
			"\"It's as if inside the White House the belief in Obama's inspirational charisma is still such that every time the ugliness of brute politics intrudes, it's a startling revelation.\"\n - Tina Brown",
			"\"When Bill Clinton ran in '92, and I listened to him, and I had of course known of his record from Arkansas, I found him extraordinarily inspirational, and I voted Democratic.\"\n - Wesley Clark",
			"\"When the sun is shining I can do anything; no mountain is too high, no trouble too difficult to overcome.\"\n - Wilma Rudolph",
			"\"Clouds come floating into my life, no longer to carry rain or usher storm, but to add color to my sunset sky.\"\n - Rabindranath Tagore",
			"\"Keep your face always toward the sunshine - and shadows will fall behind you.\"\n - Walt Whitman",
			"\"If you always put limit on everything you do, physical or anything else. It will spread into your work and into your life. There are no limits. There are only plateaus, and you must not stay there, you must go beyond them.\"\n - Bruce Lee",
			"\"God always gives His best to those who leave the choice with him.\"\n - Jim Elliot",
			"\"Your big opportunity may be right where you are now.\"\n - Napoleon Hill",
			"\"Thousands of candles can be lighted from a single candle, and the life of the candle will not be shortened. Happiness never decreases by being shared.\"\n - Buddha",
			"\"Out of difficulties grow miracles.\"\n - Jean de la Bruyere",
			"\"What lies behind you and what lies in front of you, pales in comparison to what lies inside of you.\"\n - Ralph Waldo Emerson",
			"\"Faith is love taking the form of aspiration.\"\n - William Ellery Channing",
			"\"Even if I knew that tomorrow the world would go to pieces, I would still plant my apple tree.\"\n - Martin Luther",
			"\"Give light, and the darkness will disappear of itself.\"\n - Desiderius Erasmus",
			"\"No matter what people tell you, words and ideas can change the world.\"\n - Robin Williams",
			"\"With self-discipline most anything is possible.\"\n - Theodore Roosevelt",
			"\"Happiness resides not in possessions, and not in gold, happiness dwells in the soul.\"\n - Democritus",
			"\"To love means loving the unlovable. To forgive means pardoning the unpardonable. Faith means believing the unbelievable. Hope means hoping when everything seems hopeless.\"\n - Gilbert K. Chesterton",
			"\"Everyone here has the sense that right now is one of those moments when we are influencing the future.\"\n - Steve Jobs",
			"\"When you get into a tight place and everything goes against you, till it seems as though you could not hang on a minute longer, never give up then, for that is just the place and time that the tide will turn.\"\n - Harriet Beecher Stowe",
			"\"Tomorrow is the most important thing in life. Comes into us at midnight very clean. It's perfect when it arrives and it puts itself in our hands. It hopes we've learned something from yesterday.\"\n - John Wayne",
			"\"It is always the simple that produces the marvelous.\"\n - Amelia Barr",
			"\"To the mind that is still, the whole universe surrenders.\"\n - Lao Tzu",
			"\"We must let go of the life we have planned, so as to accept the one that is waiting for us.\"\n - Joseph Campbell",
			"\"How wonderful it is that nobody need wait a single moment before starting to improve the world.\"\n - Anne Frank",
			"\"Don't let the fear of striking out hold you back.\"\n - Babe Ruth",
			"\"I will love the light for it shows me the way, yet I will endure the darkness because it shows me the stars.\"\n - Og Mandino",
			"\"Someone is sitting in the shade today because someone planted a tree a long time ago.\"\n - Warren Buffett",
			"\"It is in your moments of decision that your destiny is shaped.\"\n - Tony Robbins",
			"\"And when I breathed, my breath was lightning.\"\n - Black Elk",
			"\"Tears of joy are like the summer rain drops pierced by sunbeams.\"\n - Hosea Ballou",
			"\"What we achieve inwardly will change outer reality.\"\n - Plutarch",
			"\"If opportunity doesn't knock, build a door.\"\n - Milton Berle",
			"\"People tell you the world looks a certain way. Parents tell you how to think. Schools tell you how to think. TV. Religion. And then at a certain point, if you're lucky, you realize you can make up your own mind. Nobody sets the rules but you. You can design your own life.\"\n - Carrie-Anne Moss",
			"\"Your present circumstances don't determine where you can go; they merely determine where you start.\"\n - Nido Qubein",
			"\"Everyone has inside of him a piece of good news. The good news is that you don't know how great you can be! How much you can love! What you can accomplish! And what your potential is!\"\n - Anne Frank",
			"\"Accept the things to which fate binds you, and love the people with whom fate brings you together, but do so with all your heart.\"\n - Marcus Aurelius",
			"\"Two roads diverged in a wood and I - I took the one less traveled by, and that has made all the difference.\"\n - Robert Frost",
			"\"The only journey is the one within.\"\n - Rainer Maria Rilke",
			"\"Just don't give up trying to do what you really want to do. Where there is love and inspiration, I don't think you can go wrong.\"\n - Ella Fitzgerald",
			"\"Keep all special thoughts and memories for lifetimes to come. Share these keepsakes with others to inspire hope and build from the past, which can bridge to the future.\"\n - Mattie Stepanek",
			"\"Let us dream of tomorrow where we can truly love from the soul, and know love as the ultimate truth at the heart of all creation.\"\n - Michael Jackson",
			"\"If a man does not keep pace with his companions, perhaps it is because he hears a different drummer. Let him step to the music which he hears, however measured or far away.\"\n - Henry David Thoreau",
			"\"All you need is the plan, the road map, and the courage to press on to your destination.\"\n - Earl Nightingale",
			"\"Turn your face to the sun and the shadows fall behind you.\"\n - Charlotte Whitton",
			"\"I dwell in possibility.\"\n - Emily Dickinson",
			"\"From a small seed a mighty trunk may grow.\"\n - Aeschylus",
			"\"What we need is more people who specialize in the impossible.\"\n - Theodore Roethke",
			"\"Happiness is a butterfly, which when pursued, is always just beyond your grasp, but which, if you will sit down quietly, may alight upon you.\"\n - Nathaniel Hawthorne",
			"\"Follow your bliss and the universe will open doors where there were only walls.\"\n - Joseph Campbell",
			"\"Try to be like the turtle - at ease in your own shell.\"\n - Bill Copeland",
			"\"Be brave enough to live life creatively. The creative place where no one else has ever been.\"\n - Alan Alda",
			"\"The most authentic thing about us is our capacity to create, to overcome, to endure, to transform, to love and to be greater than our suffering.\"\n - Ben Okri",
			"\"If you accept the expectations of others, especially negative ones, then you never will change the outcome.\"\n - Michael Jordan",
			"\"Your heart is full of fertile seeds, waiting to sprout.\"\n - Morihei Ueshiba",
			"\"You must do the things you think you cannot do.\"\n - Eleanor Roosevelt",
			"\"If we did all the things we are capable of, we would literally astound ourselves.\"\n - Thomas A. Edison",
			"\"Enthusiasm moves the world.\"\n - Arthur Balfour",
			"\"The books that help you most are those which make you think that most. The hardest way of learning is that of easy reading; but a great book that comes from a great thinker is a ship of thought, deep freighted with truth and beauty.\"\n - Pablo Neruda",
			"\"Throw your dreams into space like a kite, and you do not know what it will bring back, a new life, a new friend, a new love, a new country.\"\n - Anais Nin",
			"\"The glow of one warm thought is to me worth more than money.\"\n - Thomas Jefferson",
			"\"It is never too late to be what you might have been.\"\n - George Eliot",
			"\"Once I knew only darkness and stillness... my life was without past or future... but a little word from the fingers of another fell into my hand that clutched at emptiness, and my heart leaped to the rapture of living.\"\n - Helen Keller",
			"\"I have always believed, and I still believe, that whatever good or bad fortune may come our way we can always give it meaning and transform it into something of value.\"\n - Hermann Hesse",
			"\"It is not ignorance but knowledge which is the mother of wonder.\"\n - Joseph Wood Krutch",
			"\"Keep your feet on the ground, but let your heart soar as high as it will. Refuse to be average or to surrender to the chill of your spiritual environment.\"\n - Arthur Helps",
			"\"The fact that I can plant a seed and it becomes a flower, share a bit of knowledge and it becomes another's, smile at someone and receive a smile in return, are to me continual spiritual exercises.\"\n - Leo Buscaglia",
			"\"A compliment is something like a kiss through a veil.\"\n - Victor Hugo",
			"\"I know why I am here and my only real focused goal is to live each day to the fullest and to try and honor God and be an encouragement to others. What the future holds is firmly in God's hands, and I am very happy about that!\"\n - Ken Hensley",
			"\"We have it in our power to begin the world over again.\"\n - Thomas Paine",
			"\"Thought is the wind, knowledge the sail, and mankind the vessel.\"\n - Augustus Hare",
			"\"Man never made any material as resilient as the human spirit.\"\n - Bernard Williams",
			"\"Look within. Within is the fountain of good, and it will ever bubble up, if thou wilt ever dig.\"\n - Marcus Aurelius",
			"\"Every moment and every event of every man's life on earth plants something in his soul.\"\n - Thomas Merton",
			"\"Happiness is not something you postpone for the future; it is something you design for the present.\"\n - Jim Rohn",
			"\"Every day we should hear at least one little song, read one good poem, see one exquisite picture, and, if possible, speak a few sensible words.\"\n - Johann Wolfgang von Goethe",
			"\"As people are walking all the time, in the same spot, a path appears.\"\n - John Locke",
			"\"Let your life lightly dance on the edges of Time like dew on the tip of a leaf.\"\n - Rabindranath Tagore",
			"\"I have looked into your eyes with my eyes. I have put my heart near your heart.\"\n - Pope John XXIII",
			"\"I love those who yearn for the impossible.\"\n - Johann Wolfgang von Goethe",
			"\"Do your little bit of good where you are; its those little bits of good put together that overwhelm the world.\"\n - Desmond Tutu"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int randomQuote = new Random().nextInt(INSPIRATIONAL.length);
		startService(getIntent().<Intent>getParcelableExtra("SEND_MESSAGE").setAction(INSPIRATIONAL[randomQuote]));
		finish();
	}

}
