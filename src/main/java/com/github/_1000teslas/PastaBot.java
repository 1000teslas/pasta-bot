package com.github._1000teslas;

import java.util.Map;
import static java.util.Map.entry;

import javax.security.auth.login.LoginException;

import com.bettercloud.vault.Vault;
import com.bettercloud.vault.VaultConfig;
import com.bettercloud.vault.VaultException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Hello world!
 *
 */
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
                    """), entry("penis-kun",
                    "Dicks are so cute omg( •?• ) when you hold one in your hand and it starts twitching its like its nuzzling you(/) or when they perk up and look at you like\"owo nya?:3 c\" hehe ~ penis-kun is happy to see me!!(?) and the most adorable thing ever is when sperm-sama comes out but theyre rlly shy so u have to work hard!!(?••) but when penis-kun and sperm-sama meet and theyre blushing and all like \"uwaaa~!\" (?´?)?: ?hehehe~penis-kun is so adorable (?´???)?::?"));
    static final String HELP_MESSAGE = "available pastas: " + pastas.keySet().toString();

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
            channel.sendMessage(pastas.getOrDefault(content, HELP_MESSAGE)).queue();
        }
    }
}
