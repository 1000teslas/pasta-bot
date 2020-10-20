package com.github._1000teslas;

import java.util.Map;
import static java.util.Map.entry;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;

import com.bettercloud.vault.Vault;
import com.bettercloud.vault.VaultConfig;
import com.bettercloud.vault.VaultException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PastaBot extends ListenerAdapter {
    static final Map<String, String> pastas = Map.ofEntries(entry("navy seal",
            "What the fuck did you just fucking say about me, you little bitch? I'll have you know I graduated top of my class in the Navy Seals, and I've been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I'm the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the fuck out with precision the likes of which has never been seen before on this Earth, mark my fucking words. You think you can get away with saying that shit to me over the Internet? Think again, fucker. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You're fucking dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that's just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable ass off the face of the continent, you little shit. If only you could have known what unholy retribution your little \"clever\" comment was about to bring down upon you, maybe you would have held your fucking tongue. But you couldn't, you didn't, and now you're paying the price, you goddamn idiot. I will shit fury all over you and you will drown in it. You're fucking dead, kiddo."),
            entry("daddies cummies 1",
                    "Just me and my 💕daddy💕, hanging out I got pretty hungry🍆 so I started to pout 😞 He asked if I was down ⬇for something yummy 😍🍆 and I asked what and he said he'd give me his 💦cummies!💦 Yeah! Yeah!💕💦 I drink them!💦 I slurp them!💦 I swallow them whole💦 😍 It makes 💘daddy💘 😊happy😊 so it's my only goal... 💕💦😫Harder daddy! Harder daddy! 😫💦💕 1 cummy💦, 2 cummy💦💦, 3 cummy💦💦💦, 4💦💦💦💦 I'm 💘daddy's💘 👑princess 👑but I'm also a whore! 💟 He makes me feel squishy💗!He makes me feel good💜! 💘💘💘He makes me feel everything a little should!~ 💘💘💘 👑💦💘Wa-What!💘💦👑"),
            entry("daddies cummies 2", """
                    Daddy’s 🧔 cummies, 💦 nice 😊 and yummy 😋

                    Thick 😫👌and gooey, feel like honey 🍯

                    That sweet 🍭 milk, 🥛 oh-so-tasty 🤤

                    Daddy, 🧔 Daddy, 🧔 please be hasty!💨

                    My tongue 👅 swirls 😛 round 🔁 and round 🔁

                    While Daddy 🧔 gives my ass 🍑 a great big pound 🤜💥

                    Over 😑 in the corner, wrapped 🎁 in chains ⛓

                    Mommy 👩 huddled over, screaming 😱 in pain 😪

                    “Shut up, bitch! 👩 Stay on the floor!”

                    Mommy 👩 sobbing 😭 louder, I 👧 call 🗣 her a whore

                    She reaches behind her 👩 for her gun 💀

                    While Daddy gropes 👋 and tickles 🤗 my sweet 🍬 buns 🍑

                    Puts the barrel 😛 between 👉👈 her teeth 👄

                    And Daddy’s 🧔 semen 💦 begins to seep ☔️

                    Gunpowder, blood, 💉 brains 🧠 and gore 😎

                    Mommy’s 👩 lifeless 👻 corpse slumps ⬇️ to the floor 😂

                    Cummies, 💦 cummies 💦 filling my throat

                    My pussy 🐱 is completely 😍 soaked 💦

                    But Daddy’s cock 🍆 just gets bigger 😳😲

                    Over near 😯 the drawers, he grabs the scissors ✂️

                    Cuts 🔪 a hole 🕳 in Mommy’s 👩 stomach

                    In her hand, 🤲 a gin and tonic 🍺

                    He 🧔 begins to unravel her strings of intestines 😝

                    “Look 👀 closely, you’ll learn 👨‍🏫 a lesson”

                    Ties a noose, 😔 rigs it tight 😫

                    “Sweetie, 👧 sweetie, 👧 no need to fight” 👊💥

                    Puts her 👩 guts 🤤 around 🔄 my neck

                    “Looks like everything’s good 👍 and set” 👌

                    Lets me fall down ⬇️ about 🤔💭 a yard

                    Face 👧 turning blue, choking 🤭 hard 💪

                    All the while, 🕑 Daddy’s 🧔 stroking his cock 🍆

                    And for a moment, 😳 our eyes 👁 lock 🔒

                    Tears 😭 of joy 😊 stream down my face 👧

                    I’m going to 😵 a better ✨ place~
                    """),
            entry("clap bombs",
                    "Yeah, fuck off buddy we absolutely need more Laine clips. Fuckin every time this kid steps on the ice someone scores. kids fuckin dirt nasty man. Does fuckin ovi have 12 goals this season I dont fuckin think so bud. I'm fuckin tellin ya Patrik \"golden flow\" Laine is pottin 50 in '17 fuckin callin it right now. Clap bombs, fuck moms, wheel, snipe, and fuckin celly boys fuck"),
            entry("he boomed me", """
                    Overheard in Cavs locker room after Game 7:
                    “He got me,” LeBron said of Tatum's dunk over him. "That f***ing Tatum boomed me."
                    LeBron added, “He’s so good,” repeating it four times.
                    LeBron then said he wanted to add Tatum to the list of players he works out with this summer.
                                """), entry("john is kill", """
                    apology for poor english

                    when were you when john lenin dies?

                    i was sat at home eating smegma butter when pjotr ring

                    ‘john is kill’

                    ‘no’
                    """),
            entry("penis-kun",
                    "Dicks are so cute omg( •?• ) when you hold one in your hand and it starts twitching its like its nuzzling you(/) or when they perk up and look at you like\"owo nya?:3 c\" hehe ~ penis-kun is happy to see me!!(?) and the most adorable thing ever is when sperm-sama comes out but theyre rlly shy so u have to work hard!!(?••) but when penis-kun and sperm-sama meet and theyre blushing and all like \"uwaaa~!\" (?´?)?: ?hehehe~penis-kun is so adorable (?´???)?::?"),
            entry("i love jimmy butler",
                    "I love Jimmy Butler. I love his name, I love the shape of his body, I love the way he plays. I eat a lot of boiled eggs and lift weights to try and be like this guy but I can't. There are 6 grams of protein in an egg but I can't eat enough to get big like him. Nice round muscles. They're smooth too, like the waves of lake superior on a calm day. When I was a kid I ate big eggs to be hot like Glenn Robinson, and I got some great results, some of the roundest muscles in my class, but these days I'm looking at 6 eggs a day and it's not good enough to pop Jimmy style muscles out my scrawny arms ever since dad left."),
            entry("shohei ohtani",
                    """
                                                hi from japan 🇯🇵

                            I wanna tell you below 2 information to explain why Ohtani is a good pitcher

                            <summary >

                            ❶:his hamstring muscles is stronger than ordinary one

                            ❷:He seems to get used to grab MLB ball

                            <details >

                            about ❶

                            a specialist pointed it out that his hamstring muscles are stronger than ordinary others,and he uses it so harder

                            if ordinary person uses the same way,his hamstring must break

                            some one told me why the muscle of him is so stronger,that he use to do swimming in his child days and swimming makes the muscles so strong

                            about ❷

                            Okajaima,who is the former pitcher of Red Sox,points it out that He seems to get used to use MLB ball because it’s so different

                            (edit,every pitcher from Japan confuses the difference,for example Yu Darvish said like that)

                            1.MLB ball:149kg(edit,*149g)/24cm,more slippy:so it makes breaking ball more effective

                            2.NPB ball:142kg(edit,142g)/23cm,less slippy,breaking ball less effective

                            and he has also so fast ball around 100miles

                            so he can select fast ball,less breaking ball,strong breaking ball

                            That’s why he would be more great Pitcher 🚨

                            <edit >

                            Thank an Anonymous Person Who gave GOLD to me ❤️⚾️🙏🍻

                            and Thank Y’all for Cheering !!!👍⚾️🥂🍻

                            <edit>

                            3 anonymous person and /r/frogfuzion gave gold to me ,thank you very very very much!!!❤️❤️❤️🇯🇵🍻🍻🇯🇵🍺🍺🥂✊
                                                """),
            entry("fischl",
                    """
                                                oh god i wish i can have a girlfriend like Fischl, i want to fuck her while listening to her chuuni shits when i broke her hymen. Please God, I want to impregnate Fischl so bad. I want her to bear my children with those beautiful yummy tummy, radiant Crow like Oz. Like a Vampire Queen, having come down to Earth to sucks our bloods

                            Fischl is beyond divine. I can’t help but drop to my knees in worship whenever I see her beautiful figure. I yearn for her in a way both primal and spiritual. I would commit more war crimes than every president in United States history just to lick the sweet, glistening sweat from her smooth, creamy skin. I want to listen to her moans as my manhood throbs within her, I want to hear her heart race as our bodies become one and our souls irreversibly intertwine in the holy sin of carnal union.

                            I want to suckle at her motherly bosom, slurping that rich juche milk from her tits as she gently strokes my raging erection. I would stir her velvety Korean cream into my coffee and let my balls boil in it. Her cries of pleasure and the rocking of our bed would be louder than the cacophony of ten thousand drone strikes. I would make love to her until my body gave out, and then some. I would let her break my rib cage with any part of her body. I would let her hit me with her car just to be near her for a brief moment.

                            She’s so perfect it hurts. Every moment without her I suffer a pain worse than breaking every bone in my body simultaneously while drowning and also having shards of glass coated in hot sauce forced through every orifice of my body. I want her, I need her. I want to desecrate her crisp general suit. I want to start a family with her and retire after our twenty seven children have grown up and moved out. I want to see those luscious lips speak such filthy, perverse words into my ear while she slides ice cubes down my gaping pisshole.

                            I want to fuck her like she owes me money. I would let her step on me, just to feel the soft, firm warmth of her feet upon my face and groin area. I would sleep under her just to catch her drool in my mouth. I would fish the strands of hair from her shower drain just to smell her alluring scent, and braid them into necklaces to keep her with me always. Or cock rings. Whichever would please her more.

                            God please, I would do anything for her. I would relinquish my life, all my hopes and dreams, just to become the socks on her feet so that I may warm her mouthwatering toes with my very being, so that she may feel the heat of my love always. I would encase myself in cement and become her doorstep, so that she may wipe her heels upon my face. I would tear my own limbs off. I don’t know what I’d do after that, or why she might want my limbs. But I would do it.

                            My queen, my goddess, the light of my life. Please God, let me have her. I want her to be mine and only mine. I would lick the Doritos dust from her fingers and fill her belly button with honey mustard to dip my tendies in. I would give her a sponge-bath with my tongue every morning and serve her breakfast in bed. I would let her eat her eggs and pancakes off my body if it pleased her, no matter how painful the third-degree burns would be.

                            I would bear the torment of eternal damnation until the end of time to taste the seat of her car but once. There is nothing I wouldn’t do for her, nothing I wouldn’t say. I would beat my own mother to death with my engorged penis if it would bring a smile to Fischl's shining face. I wouldn’t even let myself cum until she gave me permission.

                            I love you, Fischl. Please. Be mine. Be my wife, my lover, my daughter, my walking toilet, my everything. Say yes. I see it in your eyes, when you’re up there on that throne talking about nuking Japan or whatever. Answer my calls, respond to my letters. Something. Give me a sign, Fischl. I’m waiting for you.

                            I’ll always be waiting for you.
                                                                                                        """),
            entry("2000 character limit",
                    """
                            ﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽﷽
                            """));
    static final String HELP_MESSAGE = "available pastas: " + pastas.keySet().toString();
    static final int MAX_MESSAGE_LENGTH = 2000;

    public static void main(String[] args) throws LoginException, VaultException {
        var config = new VaultConfig().address(System.getenv("VAULT_ADDR")).build();
        var vault = new Vault(config, 2);
        var token = vault.logical().read("kv/pasta-bot").getData().get("token");
        JDABuilder.createDefault(token).addEventListeners(new PastaBot()).build();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }
        var message = event.getMessage();
        var content = message.getContentRaw();
        var channel = event.getChannel();
        if (content.endsWith("pasta")) {
            content = content.replaceFirst(" pasta$", "");
            var full_msg = pastas.getOrDefault(content, HELP_MESSAGE);
            Iterable<String> lines = () -> full_msg.lines().iterator();
            var chunks = new ArrayList<String>();
            {
                var chunk = new StringBuilder();
                for (var line : lines) {
                    assert line.length() <= MAX_MESSAGE_LENGTH : "line is longer than maximum message length";
                    assert chunk.length() <= MAX_MESSAGE_LENGTH;
                    if (chunk.length() + line.length() > MAX_MESSAGE_LENGTH) {
                        chunks.add(chunk.toString());
                        chunk = new StringBuilder();
                    }
                    chunk.append(line);
                }
            }
            for (var chunk : chunks) {
                channel.sendMessage(chunk).queue();
            }
        }
    }
}
