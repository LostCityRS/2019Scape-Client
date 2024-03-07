package com.jagex;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acz")
public class Class74 {

	@OriginalMember(owner = "client!acz", name = "gi", descriptor = "Lclient!abe;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!acz", name = "e", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_107 = new Class74("This is the developer console. To close, press the ALT-`, ALT-² or ALT-§ keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten ALT+`, ALT+² oder ALT+§ drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches ALT+`, ALT+² ou ALT+§.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione ALT-`, ALT-² ou ALT-§.", "Esta es la consola de desarrolador. Para cerrarla, pulsa las teclas ALT-`, ALT-² or ALT-§ en tu teclado.");

	@OriginalMember(owner = "client!acz", name = "n", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_116 = new Class74("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s'est produite lors de l'exécution de la commande.", "Houve um erro quando o comando foi executado.", "Se produjo un error al ejecutar el comando.");

	@OriginalMember(owner = "client!acz", name = "m", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_3 = new Class74("The developer console can be accessed with ALT-`, ALT-§ or ALT-².", "Die Entwicklerkonsole kann mit ALT+`, ALT+§ oder ALT+² aktiviert werden.", "La console de développement est accessible grâce aux touches ALT+`, ALT+§ ou ALT+².", "O painel de controle do desenvolvedor pode ser acessado com ALT-`, ALT-§ ou ALT-².", "Puedes acceder a la consola de desarrollador con ALT-`, ALT-§ o ALT-².");

	@OriginalMember(owner = "client!acz", name = "k", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_4 = new Class74("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ", "Comando desconocido: ");

	@OriginalMember(owner = "client!acz", name = "f", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_56 = new Class74("Cancel", "Abbrechen", "Annuler", "Cancelar", "Cancelar");

	@OriginalMember(owner = "client!acz", name = "w", descriptor = "Lclient!acz;")
	static final Class74 aClass74_6 = new Class74("#Player", "#Spieler", "#Joueur", "#Jogador", "#Jugador");

	@OriginalMember(owner = "client!acz", name = "l", descriptor = "Lclient!acz;")
	static final Class74 aClass74_144 = new Class74("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.", "Accede a un servidor para miembros para usar este objeto.");

	@OriginalMember(owner = "client!acz", name = "u", descriptor = "Lclient!acz;")
	static final Class74 aClass74_8 = new Class74("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.", "Cambia este vale en cualquier banco por el objeto equivalente.");

	@OriginalMember(owner = "client!acz", name = "z", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_9 = new Class74("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");

	@OriginalMember(owner = "client!acz", name = "p", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_55 = new Class74("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");

	@OriginalMember(owner = "client!acz", name = "d", descriptor = "Lclient!acz;")
	static final Class74 aClass74_43 = new Class74("Combine ", "Kombiniere ", "Vous pouvez combiner ", "Você pode trocar ", "Puedes combinar ");

	@OriginalMember(owner = "client!acz", name = "c", descriptor = "Lclient!acz;")
	static final Class74 aClass74_12 = new Class74(" shards of this type to receive a ", " dieser Fragmente, um folgenden Gegenstand herzustellen: ", " de ces fragments pour obtenir l'objet suivant : ", " desses fragmentos pelo seguinte objeto: ", " de estos fragmentos para obtener el siguiente objeto: ");

	@OriginalMember(owner = "client!acz", name = "r", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_13 = new Class74("Combine", "Kombinieren", "Combiner", "Combinar", "Combinar");

	@OriginalMember(owner = "client!acz", name = "v", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_14 = new Class74("Take", "Nehmen", "Prendre", "Pegar", "Agarrar");

	@OriginalMember(owner = "client!acz", name = "o", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_15 = new Class74("Drop", "Fallen lassen", "Poser", "Largar", "Dejar");

	@OriginalMember(owner = "client!acz", name = "s", descriptor = "Lclient!acz;")
	static final Class74 aClass74_37 = new Class74("Ok", "Okay", "OK", "Ok", "OK");

	@OriginalMember(owner = "client!acz", name = "y", descriptor = "Lclient!acz;")
	static final Class74 aClass74_122 = new Class74("Select", "Auswählen", "Sélectionner", "Selecionar", "Seleccionar");

	@OriginalMember(owner = "client!acz", name = "q", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_18 = new Class74("Continue", "Weiter", "Continuer", "Continuar", "Continuar");

	@OriginalMember(owner = "client!acz", name = "x", descriptor = "Lclient!acz;")
	static final Class74 aClass74_19 = new Class74("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.", "Nombre de jugador no válido.");

	@OriginalMember(owner = "client!acz", name = "b", descriptor = "Lclient!acz;")
	static final Class74 aClass74_67 = new Class74("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!", "¡No te puedes denunciar a ti mismo!");

	@OriginalMember(owner = "client!acz", name = "h", descriptor = "Lclient!acz;")
	static final Class74 aClass74_21 = new Class74("You have sent too many abuse reports today! Do not abuse this system!", "Du hast heute schon zu viele Regelverstöße gemeldet! Missbrauch das System nicht!", "Vous avez signalé trop d’abus pour aujourd’hui. N’abusez pas de ce système !", "Você já denunciou abuso muitas vezes hoje. Não abuse do sistema!", "¡Ya has denunciado demasiadas infracciones hoy! ¡No abuses del sistema!");

	@OriginalMember(owner = "client!acz", name = "a", descriptor = "Lclient!acz;")
	static final Class74 aClass74_22 = new Class74("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por um membro da equipe Jagex, pois ela faz parte da equipe.", "Esa persona es miembro del personal de Jagex, no puedes denunciarla por suplantación de identidad.");

	@OriginalMember(owner = "client!acz", name = "g", descriptor = "Lclient!acz;")
	static final Class74 aClass74_23 = new Class74("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada ao lado de seu nome.", "Los moderadores de Jagex tienen una corona dorada a un lado del nombre.");

	@OriginalMember(owner = "client!acz", name = "i", descriptor = "Lclient!acz;")
	static final Class74 aClass74_138 = new Class74("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você pode denunciar essa pessoa por outro tipo de infração.", "Puedes denunciar a esa persona por otro tipo de infracción.");

	@OriginalMember(owner = "client!acz", name = "j", descriptor = "Lclient!acz;")
	static final Class74 aClass74_136 = new Class74("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.", "Gracias, hemos recibido tu denuncia.");

	@OriginalMember(owner = "client!acz", name = "t", descriptor = "Lclient!acz;")
	static final Class74 aClass74_29 = new Class74("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.", "Sistema ocupado. No ha sido posible enviar tu denuncia.");

	@OriginalMember(owner = "client!acz", name = "ae", descriptor = "Lclient!acz;")
	static final Class74 aClass74_166 = new Class74("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido", "Nombre no válido");

	@OriginalMember(owner = "client!acz", name = "ag", descriptor = "Lclient!acz;")
	static final Class74 aClass74_28 = new Class74("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.", "Accede a un servidor para miembros para usar este objeto.");

	@OriginalMember(owner = "client!acz", name = "ah", descriptor = "Lclient!acz;")
	static final Class74 aClass74_121 = new Class74("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.", "Para interactuar, accede a un servidor para miembros.");

	@OriginalMember(owner = "client!acz", name = "al", descriptor = "Lclient!acz;")
	static final Class74 aClass74_95 = new Class74("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.", "No sucede nada interesante.");

	@OriginalMember(owner = "client!acz", name = "ac", descriptor = "Lclient!acz;")
	static final Class74 aClass74_31 = new Class74("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.", "No puedes alcanzar eso.");

	@OriginalMember(owner = "client!acz", name = "ai", descriptor = "Lclient!acz;")
	static final Class74 aClass74_32 = new Class74("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!", "¡Teletransporte no válido!");

	@OriginalMember(owner = "client!acz", name = "aw", descriptor = "Lclient!acz;")
	static final Class74 aClass74_33 = new Class74("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.", "Para entrar aquí, debes acceder a un servidor para miembros.");

	@OriginalMember(owner = "client!acz", name = "as", descriptor = "Lclient!acz;")
	static final Class74 aClass74_2 = new Class74("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.", "Sistema ocupado. No es posible añadir a un amigo.");

	@OriginalMember(owner = "client!acz", name = "at", descriptor = "Lclient!acz;")
	static final Class74 aClass74_35 = new Class74("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar esse amigo - jogador desconhecido.", "Jugador desconocido. No es posible añadir a ese amigo.");

	@OriginalMember(owner = "client!acz", name = "ad", descriptor = "Lclient!acz;")
	static final Class74 aClass74_36 = new Class74("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.", "Sistema ocupado. No es posible añadir el nombre.");

	@OriginalMember(owner = "client!acz", name = "am", descriptor = "Lclient!acz;")
	static final Class74 aClass74_64 = new Class74("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar esse nome - jogador desconhecido.", "Jugador desconocido. No es posible añadir el nombre.");

	@OriginalMember(owner = "client!acz", name = "au", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_38 = new Class74("Your friends list is full (400 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 400 erreicht.", "Votre liste d'amis est pleine (400 noms maximum).", "Sua lista de amigos está cheia. O limite é de 400 nomes.", "Tu lista de amigos está llena. El límite es de 400 amigos.");

	@OriginalMember(owner = "client!acz", name = "ar", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_39 = new Class74("Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Votre liste d'amis est pleine (200 noms maximum).", "Sua lista de amigos está cheia. O limite é de 200 nomes.", "Tu lista de amigos está llena. El límite es de 200 amigos.");

	@OriginalMember(owner = "client!acz", name = "ap", descriptor = "Lclient!acz;")
	static final Class74 aClass74_173 = new Class74("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.", "Servidor ocupado. No es posible borrar al amigo.");

	@OriginalMember(owner = "client!acz", name = "aq", descriptor = "Lclient!acz;")
	static final Class74 aClass74_41 = new Class74("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.", "Sistema ocupado. No es posible borrar el nombre.");

	@OriginalMember(owner = "client!acz", name = "ax", descriptor = "Lclient!acz;")
	static final Class74 aClass74_42 = new Class74("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.", "Sistema ocupado. No es posible enviar el mensaje.");

	@OriginalMember(owner = "client!acz", name = "av", descriptor = "Lclient!acz;")
	static final Class74 aClass74_87 = new Class74("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.", "No es posible enviar el mensaje, el jugador no está disponible.");

	@OriginalMember(owner = "client!acz", name = "ao", descriptor = "Lclient!acz;")
	static final Class74 aClass74_16 = new Class74(null, "der Spieler ist momentan nicht verfügbar.", null, null, null);

	@OriginalMember(owner = "client!acz", name = "aj", descriptor = "Lclient!acz;")
	static final Class74 aClass74_45 = new Class74("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.", "No es posible enviar el mensaje. El jugador no está en tu lista de amigos.");

	@OriginalMember(owner = "client!acz", name = "ay", descriptor = "Lclient!acz;")
	static final Class74 aClass74_17 = new Class74(null, "Spieler nicht auf deiner Freunde-Liste.", null, null, null);

	@OriginalMember(owner = "client!acz", name = "ab", descriptor = "Lclient!acz;")
	static final Class74 aClass74_30 = new Class74("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!", "Parece que le estás revelando a alguien tu contraseña. ¡No debes hacerlo!");

	@OriginalMember(owner = "client!acz", name = "az", descriptor = "Lclient!acz;")
	static final Class74 aClass74_48 = new Class74("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!", "¡Si no es así, cambia tu contraseña por una menos evidente!");

	@OriginalMember(owner = "client!acz", name = "aa", descriptor = "Lclient!acz;")
	static final Class74 aClass74_128 = new Class74("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "Não é possível enviar a mensagem. Defina um nome de personagem primeiro, fazendo login no jogo.", "No es posible enviar el mensaje. Registra primero un nombre de personaje conectándote al juego.");

	@OriginalMember(owner = "client!acz", name = "af", descriptor = "Lclient!acz;")
	static final Class74 aClass74_50 = new Class74(null, "indem du dich ins Spiel einloggst.", null, null, null);

	@OriginalMember(owner = "client!acz", name = "ak", descriptor = "Lclient!acz;")
	static final Class74 aClass74_51 = new Class74("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.", "Sólo puedes denunciar por esa regla a jugadores que hayan hablado o comerciado recientemente.");

	@OriginalMember(owner = "client!acz", name = "an", descriptor = "Lclient!acz;")
	static final Class74 aClass74_52 = new Class74(null, "die kürzlich gesprochen oder gehandelt haben.", null, null, null);

	@OriginalMember(owner = "client!acz", name = "bf", descriptor = "Lclient!acz;")
	static final Class74 aClass74_53 = new Class74("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.", "Este jugador está desconectado o activó el modo de privacidad.");

	@OriginalMember(owner = "client!acz", name = "bl", descriptor = "Lclient!acz;")
	static final Class74 aClass74_124 = new Class74("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.", "En estos momentos no puedes enviar un mensaje rápido de chat a un jugador en este mundo.");

	@OriginalMember(owner = "client!acz", name = "bk", descriptor = "Lclient!acz;")
	static final Class74 aClass74_26 = new Class74(null, "geschickt werden.", null, null, null);

	@OriginalMember(owner = "client!acz", name = "bh", descriptor = "Lclient!acz;")
	static final Class74 aClass74_34 = new Class74("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.", "Este jugador no puede recibir su mensaje porque está en un mundo de chat rápido.");

	@OriginalMember(owner = "client!acz", name = "bx", descriptor = "Lclient!acz;")
	static final Class74 aClass74_57 = new Class74("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado", "Chat desactivado");

	@OriginalMember(owner = "client!acz", name = "bd", descriptor = "Lclient!acz;")
	static final Class74 aClass74_125 = new Class74("friends_chat", "friends_chat", "friends_chat", "friends_chat", "friends_chat");

	@OriginalMember(owner = "client!acz", name = "bc", descriptor = "Lclient!acz;")
	static final Class74 aClass74_59 = new Class74("You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "Vous ne faites pas partie d'un canal de discussion.", "No momento, você não está no bate-papo entre amigos.", "Actualmente no estás en un canal de chat entre amigos.");

	@OriginalMember(owner = "client!acz", name = "bi", descriptor = "Lclient!acz;")
	static final Class74 aClass74_60 = new Class74("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de discussion.", "Você não está autorizado a falar neste bate-papo entre amigos.", "No estás autorizado a hablar en este canal de chat entre amigos.");

	@OriginalMember(owner = "client!acz", name = "bn", descriptor = "Lclient!acz;")
	static final Class74 aClass74_61 = new Class74("Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi de ce message – veuillez réessayer ultérieurement !", "Erro ao enviar mensagem para bate-papo entre amigos - tente novamente mais tarde!", "Se ha producido un error al enviar un mensaje al chat entre amigos, por favor, inténtalo más tarde.");

	@OriginalMember(owner = "client!acz", name = "bt", descriptor = "Lclient!acz;")
	static final Class74 aClass74_62 = new Class74("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.", "Por favor, espera hasta haberte desconectado del anterior chat.");

	@OriginalMember(owner = "client!acz", name = "bq", descriptor = "Lclient!acz;")
	static final Class74 aClass74_63 = new Class74("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.", "En este momento no estás en un canal.");

	@OriginalMember(owner = "client!acz", name = "bm", descriptor = "Lclient!acz;")
	static final Class74 aClass74_97 = new Class74("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...", "Intentando acceder a un canal...");

	@OriginalMember(owner = "client!acz", name = "bb", descriptor = "Lclient!acz;")
	static final Class74 aClass74_159 = new Class74("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para sair do canal...", "Enviando solicitud para abandonar el canal...");

	@OriginalMember(owner = "client!acz", name = "be", descriptor = "Lclient!acz;")
	static final Class74 aClass74_66 = new Class74("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...", "Ya estás intentando unirte a un canal. Por favor, espera...");

	@OriginalMember(owner = "client!acz", name = "by", descriptor = "Lclient!acz;")
	static final Class74 aClass74_176 = new Class74("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...", "La salida del canal está procesándose. Por favor, espera...");

	@OriginalMember(owner = "client!acz", name = "bu", descriptor = "Lclient!acz;")
	static final Class74 aClass74_44 = new Class74("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!", "¡Nombre de canal no valido!");

	@OriginalMember(owner = "client!acz", name = "bw", descriptor = "Lclient!acz;")
	static final Class74 aClass74_69 = new Class74("Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", "Não foi possível entrar no bate-papo entre amigos - tente novamente mais tarde!", "Ahora mismo no es posible unirse al chat entre amigos. ¡Por favor, inténtalo más tarde!");

	@OriginalMember(owner = "client!acz", name = "bo", descriptor = "Lclient!acz;")
	static final Class74 aClass74_27 = new Class74("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ", "Falando agora no bate-papo entre amigos: ", "Hablando ahora en el chat entre amigos: ");

	@OriginalMember(owner = "client!acz", name = "bz", descriptor = "Lclient!acz;")
	static final Class74 aClass74_71 = new Class74("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Vous participez actuellement au canal de discussion du joueur : ", "Falando agora no bate-papo entre amigos do jogador: ", "Hablando ahora en el canal de chat entre amigos del jugador: ");

	@OriginalMember(owner = "client!acz", name = "bv", descriptor = "Lclient!acz;")
	static final Class74 aClass74_72 = new Class74("Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !", "Erro ao participar do bate-papo entre amigos - tente novamente mais tarde!", "Se ha producido un error al acceder al canal de chat entre amigos. ¡Por favor, inténtalo más tarde!");

	@OriginalMember(owner = "client!acz", name = "br", descriptor = "Lclient!acz;")
	static final Class74 aClass74_73 = new Class74("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente novamente mais tarde!", "De momento tienes bloqueado el acceso a los canales chat. ¡Inténtalo de nuevo más tarde!");

	@OriginalMember(owner = "client!acz", name = "bg", descriptor = "Lclient!acz;")
	static final Class74 aClass74_96 = new Class74("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.", "El canal al que intentas unirte no existe.");

	@OriginalMember(owner = "client!acz", name = "ba", descriptor = "Lclient!acz;")
	static final Class74 aClass74_147 = new Class74("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.", "El canal al que intentas unirte está lleno en estos momentos.");

	@OriginalMember(owner = "client!acz", name = "bp", descriptor = "Lclient!acz;")
	static final Class74 aClass74_76 = new Class74("You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de discussion.", "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.", "No tienes rango suficiente para unirte a este canal de chat entre amigos.");

	@OriginalMember(owner = "client!acz", name = "bj", descriptor = "Lclient!acz;")
	static final Class74 aClass74_77 = new Class74("You are temporarily banned from this friends chat channel.", "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.", "Vous avez été exclu temporairement de ce canal de discussion.", "Você foi temporariamente banido deste bate-papo entre amigos.", "Tienes bloqueado temporalmente el acceso a este chat entre amigos.");

	@OriginalMember(owner = "client!acz", name = "bs", descriptor = "Lclient!acz;")
	static final Class74 aClass74_78 = new Class74("You are not allowed to join this user's friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.", "Você não pode entrar nesse bate-papo entre amigos deste usuário.", "No tienes permiso para acceder al canal de chat entre amigos de este usuario.");

	@OriginalMember(owner = "client!acz", name = "cl", descriptor = "Lclient!acz;")
	static final Class74 aClass74_79 = new Class74(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.", " se ha unido al canal.");

	@OriginalMember(owner = "client!acz", name = "cg", descriptor = "Lclient!acz;")
	static final Class74 aClass74_80 = new Class74(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " saiu do canal.", " ha abandonado el canal.");

	@OriginalMember(owner = "client!acz", name = "ce", descriptor = "Lclient!acz;")
	static final Class74 aClass74_81 = new Class74(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.", " ha sido expulsado del canal.");

	@OriginalMember(owner = "client!acz", name = "cu", descriptor = "Lclient!acz;")
	static final Class74 aClass74_82 = new Class74("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.", "Se te ha expulsado del canal.");

	@OriginalMember(owner = "client!acz", name = "ci", descriptor = "Lclient!acz;")
	static final Class74 aClass74_83 = new Class74("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.", "Se te ha eliminado de este canal.");

	@OriginalMember(owner = "client!acz", name = "cn", descriptor = "Lclient!acz;")
	static final Class74 aClass74_84 = new Class74("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.", "Has salido del canal.");

	@OriginalMember(owner = "client!acz", name = "cv", descriptor = "Lclient!acz;")
	static final Class74 aClass74_54 = new Class74("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "Votre canal de discussion est maintenant activé !", "O seu bate-papo entre amigos foi ativado!", "¡Tu canal de chat entre amigos está activado!");

	@OriginalMember(owner = "client!acz", name = "cp", descriptor = "Lclient!acz;")
	static final Class74 aClass74_148 = new Class74("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ", "Para entrar en tu canal, haz clic sobre 'Participar' e introduce: ");

	@OriginalMember(owner = "client!acz", name = "ca", descriptor = "Lclient!acz;")
	static final Class74 aClass74_145 = new Class74("Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "Votre canal de discussion est maintenant désactivé !", "O seu bate-papo entre amigos foi desativado!", "¡Tu canal de chat entre amigos ha sido desactivado!");

	@OriginalMember(owner = "client!acz", name = "cx", descriptor = "Lclient!acz;")
	static final Class74 aClass74_157 = new Class74("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.", "No tienes autorización para expulsar a usuarios de este canal.");

	@OriginalMember(owner = "client!acz", name = "cw", descriptor = "Lclient!acz;")
	static final Class74 aClass74_89 = new Class74("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.", "No tienes autorización para expulsar a este usuario.");

	@OriginalMember(owner = "client!acz", name = "ct", descriptor = "Lclient!acz;")
	static final Class74 aClass74_103 = new Class74("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.", "Ese usuario no está en este canal.");

	@OriginalMember(owner = "client!acz", name = "cf", descriptor = "Lclient!acz;")
	static final Class74 aClass74_91 = new Class74("Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Votre demande d'exclusion de ce joueur a été acceptée.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.", "Tu petición de expulsar/suspender a este usuario ha sido aceptada.");

	@OriginalMember(owner = "client!acz", name = "co", descriptor = "Lclient!acz;")
	static final Class74 aClass74_92 = new Class74("Your request to refresh this user's temporary ban was successful.", "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.", "Le renouvellement d'exclusion temporaire de ce joueur a été accepté.", "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.", "Tu petición de prolongar la suspensión temporal de este usuario ha sido aceptada.");

	@OriginalMember(owner = "client!acz", name = "cr", descriptor = "Lclient!acz;")
	static final Class74 aClass74_93 = new Class74("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.", "Se te ha vetado temporalmente por haber violado una regla.");

	@OriginalMember(owner = "client!acz", name = "cm", descriptor = "Lclient!acz;")
	static final Class74 aClass74_94 = new Class74("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ", "Este veto permancereá activo todavía durante ");

	@OriginalMember(owner = "client!acz", name = "cq", descriptor = "Lclient!acz;")
	static final Class74 aClass74_88 = new Class74(" days.", " Tage.", " jours.", " dias.", " días.");

	@OriginalMember(owner = "client!acz", name = "ch", descriptor = "Lclient!acz;")
	static final Class74 aClass74_113 = new Class74("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.", "Tu veto se retirará dentro de las próximas 24 horas.");

	@OriginalMember(owner = "client!acz", name = "cb", descriptor = "Lclient!acz;")
	static final Class74 aClass74_25 = new Class74("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.", "Para evitar otro veto, consulta el reglamento.");

	@OriginalMember(owner = "client!acz", name = "cs", descriptor = "Lclient!acz;")
	static final Class74 aClass74_98 = new Class74("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.", "Se te ha vetado permanentemente por haber violado una regla.");

	@OriginalMember(owner = "client!acz", name = "cy", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_99 = new Class74("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.", "Cargando. Por favor, espera.");

	@OriginalMember(owner = "client!acz", name = "cc", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_100 = new Class74("Profiling...", "Profiling...", "Profilage...", "Definindo perfil...", "Obteniendo perfil...");

	@OriginalMember(owner = "client!acz", name = "cz", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_101 = new Class74("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.", "Conexión perdida.");

	@OriginalMember(owner = "client!acz", name = "ck", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_102 = new Class74("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.", "Estamos intentando restablecer la conexión. Por favor, espera.");

	@OriginalMember(owner = "client!acz", name = "cj", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_85 = new Class74("Checking for updates", "Suche nach Updates", "Vérification des mises à jour", "Verificando atualizações", "Buscando actualizaciones");

	@OriginalMember(owner = "client!acz", name = "cd", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_104 = new Class74("Fetching Updates", "Lade Update", "Chargement des MAJ", "Carregando atualizações", "Cargando actualizaciones");

	@OriginalMember(owner = "client!acz", name = "dd", descriptor = "Lclient!acz;")
	static final Class74 aClass74_105 = new Class74("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ", "Cargando configuración - ");

	@OriginalMember(owner = "client!acz", name = "dr", descriptor = "Lclient!acz;")
	static final Class74 aClass74_106 = new Class74("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada", "Configuración cargada");

	@OriginalMember(owner = "client!acz", name = "da", descriptor = "Lclient!acz;")
	static final Class74 aClass74_10 = new Class74("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ", "Cargando sprites - ");

	@OriginalMember(owner = "client!acz", name = "dt", descriptor = "Lclient!acz;")
	static final Class74 aClass74_108 = new Class74("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados", "Sprites cargados");

	@OriginalMember(owner = "client!acz", name = "do", descriptor = "Lclient!acz;")
	static final Class74 aClass74_109 = new Class74("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ", "Cargando el módulo de texto - ");

	@OriginalMember(owner = "client!acz", name = "dz", descriptor = "Lclient!acz;")
	static final Class74 aClass74_110 = new Class74("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado", "Módulo de texto cargado");

	@OriginalMember(owner = "client!acz", name = "dv", descriptor = "Lclient!acz;")
	static final Class74 aClass74_111 = new Class74("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ", "Cargando interfaces - ");

	@OriginalMember(owner = "client!acz", name = "dm", descriptor = "Lclient!acz;")
	static final Class74 aClass74_112 = new Class74("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas", "Interfaces cargadas");

	@OriginalMember(owner = "client!acz", name = "dq", descriptor = "Lclient!acz;")
	static final Class74 aClass74_24 = new Class74("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando scripts de interface - ", "Cargando guión de interfaz - ");

	@OriginalMember(owner = "client!acz", name = "dc", descriptor = "Lclient!acz;")
	static final Class74 aClass74_114 = new Class74("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Script de interface carregados", "Guiones de interfaz cargados");

	@OriginalMember(owner = "client!acz", name = "di", descriptor = "Lclient!acz;")
	static final Class74 aClass74_115 = new Class74("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes adicionais - ", "Cargando fuentes adicionales - ");

	@OriginalMember(owner = "client!acz", name = "dk", descriptor = "Lclient!acz;")
	static final Class74 aClass74_118 = new Class74("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes adicionais carregadas", "Fuentes adicionales cargadas");

	@OriginalMember(owner = "client!acz", name = "dn", descriptor = "Lclient!acz;")
	static final Class74 aClass74_117 = new Class74("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ", "Cargando mapamundi - ");

	@OriginalMember(owner = "client!acz", name = "df", descriptor = "Lclient!acz;")
	static final Class74 aClass74_46 = new Class74("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado", "Mapamundi cargado");

	@OriginalMember(owner = "client!acz", name = "dw", descriptor = "Lclient!acz;")
	static final Class74 aClass74_160 = new Class74("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos", "Cargando datos de la lista de mundos");

	@OriginalMember(owner = "client!acz", name = "ds", descriptor = "Lclient!acz;")
	static final Class74 aClass74_120 = new Class74("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados", "Datos de la lista de mundos cargados");

	@OriginalMember(owner = "client!acz", name = "du", descriptor = "Lclient!acz;")
	static final Class74 aClass74_169 = new Class74("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas", "Variables de cliente cargadas");

	@OriginalMember(owner = "client!acz", name = "dl", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_131 = new Class74("Loading...", "Lade...", "Chargement en cours...", "Carregando...", "Cargando...");

	@OriginalMember(owner = "client!acz", name = "dp", descriptor = "Lclient!acz;")
	static final Class74 aClass74_123 = new Class74("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", "Cierra la interfaz que tienes abierta antes de usar el botón 'Denunciar abuso'.");

	@OriginalMember(owner = "client!acz", name = "dy", descriptor = "Lclient!acz;")
	static final Class74 aClass74_119 = new Class74(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null, null);

	@OriginalMember(owner = "client!acz", name = "db", descriptor = "Lclient!acz;")
	static final Class74 aClass74_11 = new Class74("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ", "Actualización del sistema en: ");

	@OriginalMember(owner = "client!acz", name = "dh", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_1 = new Class74(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.", " se ha conectado.");

	@OriginalMember(owner = "client!acz", name = "dx", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_126 = new Class74(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.", " se ha desconectado.");

	@OriginalMember(owner = "client!acz", name = "dg", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_127 = new Class74("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não foi possível encontrar ", "No es posible encontrar a ");

	@OriginalMember(owner = "client!acz", name = "de", descriptor = "Lclient!acz;")
	static final Class74 aClass74_65 = new Class74("Use", "Benutzen", "Utiliser", "Usar", "Usar");

	@OriginalMember(owner = "client!acz", name = "dj", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_129 = new Class74("Examine", "Untersuchen", "Examiner", "Examinar", "Examinar");

	@OriginalMember(owner = "client!acz", name = "eo", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_130 = new Class74("Attack", "Angreifen", "Attaquer", "Atacar", "Atacar");

	@OriginalMember(owner = "client!acz", name = "ey", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_90 = new Class74("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção", "Seleccionar opción");

	@OriginalMember(owner = "client!acz", name = "eu", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_132 = new Class74(" more options", " weitere Optionen", " autres options", " mais opções", " más opciones");

	@OriginalMember(owner = "client!acz", name = "ed", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_133 = new Class74("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá", "Venir acá");

	@OriginalMember(owner = "client!acz", name = "ee", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_134 = new Class74("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá", "Girar hacia acá");

	@OriginalMember(owner = "client!acz", name = "es", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_135 = new Class74("level: ", "Stufe: ", "niveau ", "nível: ", "nivel: ");

	@OriginalMember(owner = "client!acz", name = "ei", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_58 = new Class74("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ", "habilidad: ");

	@OriginalMember(owner = "client!acz", name = "el", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_137 = new Class74("rating: ", "Kampfstufe: ", "classement ", "qualificação: ", "clasificación: ");

	@OriginalMember(owner = "client!acz", name = "ej", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_149 = new Class74("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...", "Por favor, espera...");

	@OriginalMember(owner = "client!acz", name = "ep", descriptor = "Lclient!acz;")
	static final Class74 aClass74_139 = new Class74("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", "Cierra la interfaz que tienes abierta antes de usar el botón 'Denunciar abuso'.");

	@OriginalMember(owner = "client!acz", name = "ev", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_140 = new Class74(" ", ": ", " ", " ", " ");

	@OriginalMember(owner = "client!acz", name = "ec", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_141 = new Class74("M", "M", "M", "M", "M");

	@OriginalMember(owner = "client!acz", name = "ek", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_68 = new Class74("M", "M", "M", "M", "M");

	@OriginalMember(owner = "client!acz", name = "em", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_143 = new Class74("K", "T", "K", "K", "K");

	@OriginalMember(owner = "client!acz", name = "eh", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_75 = new Class74("K", "T", "K", "K", "K");

	@OriginalMember(owner = "client!acz", name = "eq", descriptor = "Lclient!acz;")
	static final Class74 aClass74_156 = new Class74("From", "Von:", "De", "De", "De");

	@OriginalMember(owner = "client!acz", name = "eg", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_146 = new Class74("Self", "Mich", "Moi", "Eu", "Mí");

	@OriginalMember(owner = "client!acz", name = "ez", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_155 = new Class74(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.", " ya está en tu lista de amigos.");

	@OriginalMember(owner = "client!acz", name = "ef", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_5 = new Class74("Your ignore list is full. Max of 400 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 400 Spieler darauf eintragen.", "Votre liste noire est pleine (400 noms maximum).", "Sua lista de ignorados está cheia. O limite é de 400 usuários.", "Tu lista de jugadores ignorados está llena, el límite es de 400.");

	@OriginalMember(owner = "client!acz", name = "et", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_167 = new Class74("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é de 100 usuários.", "Tu lista de jugadores ignorados está llena, el límite es de 100.");

	@OriginalMember(owner = "client!acz", name = "ea", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_150 = new Class74(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.", " ya está en tu lista de ignorados.");

	@OriginalMember(owner = "client!acz", name = "ew", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_151 = new Class74("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.", "No puedes añadirte a tu propia lista de amigos.");

	@OriginalMember(owner = "client!acz", name = "er", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_152 = new Class74("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.", "No puedes añadirte a tu propia lista de ignorados.");

	@OriginalMember(owner = "client!acz", name = "en", descriptor = "Lclient!acz;")
	static final Class74 aClass74_153 = new Class74("Changes will take effect on your friends chat in the next 60 seconds.", "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.", "Les modifications seront apportées à votre canal de discussion dans les 60 prochaines secondes.", "As mudanças acontecerão em seu bate-papo entre amigos nos próximos 60 segundos.", "Los cambios en tu chat de amigos se realizarán en los próximos 60 segundos.");

	@OriginalMember(owner = "client!acz", name = "eb", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_154 = new Class74("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");

	@OriginalMember(owner = "client!acz", name = "ex", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_74 = new Class74(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.", " de tu lista de ignorados.");

	@OriginalMember(owner = "client!acz", name = "fg", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_7 = new Class74("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");

	@OriginalMember(owner = "client!acz", name = "fm", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_40 = new Class74(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.", " de tu lista de amigos.");

	@OriginalMember(owner = "client!acz", name = "fu", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_158 = new Class74("yellow:", "gelb:", "jaune:", "amarelo:", "amarillo:");

	@OriginalMember(owner = "client!acz", name = "fs", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_142 = new Class74("red:", "rot:", "rouge:", "vermelho:", "rojo:");

	@OriginalMember(owner = "client!acz", name = "fz", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_49 = new Class74("green:", "grün:", "vert:", "verde:", "verde:");

	@OriginalMember(owner = "client!acz", name = "fj", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_161 = new Class74("cyan:", "blaugrün:", "cyan:", "ciano:", "cian:");

	@OriginalMember(owner = "client!acz", name = "fd", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_162 = new Class74("purple:", "lila:", "violet:", "roxo:", "violeta:");

	@OriginalMember(owner = "client!acz", name = "fn", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_163 = new Class74("white:", "weiss:", "blanc:", "branco:", "blanco:");

	@OriginalMember(owner = "client!acz", name = "fi", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_164 = new Class74("flash1:", "blinken1:", "clignotant1:", "flash1:", "parpadeante1:");

	@OriginalMember(owner = "client!acz", name = "ft", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_165 = new Class74("flash2:", "blinken2:", "clignotant2:", "flash2:", "parpadeante2:");

	@OriginalMember(owner = "client!acz", name = "fx", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_47 = new Class74("flash3:", "blinken3:", "clignotant3:", "flash3:", "parpadeante3:");

	@OriginalMember(owner = "client!acz", name = "fv", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_86 = new Class74("glow1:", "leuchten1:", "brillant1:", "brilho1:", "brillante1:");

	@OriginalMember(owner = "client!acz", name = "fc", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_168 = new Class74("glow2:", "leuchten2:", "brillant2:", "brilho2:", "brillante2:");

	@OriginalMember(owner = "client!acz", name = "fw", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_20 = new Class74("glow3:", "leuchten3:", "brillant3:", "brilho3:", "brillante3:");

	@OriginalMember(owner = "client!acz", name = "fa", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_170 = new Class74("wave:", "welle:", "ondulation:", "onda:", "onda:");

	@OriginalMember(owner = "client!acz", name = "fp", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_171 = new Class74("wave2:", "welle2:", "ondulation2:", "onda2:", "onda2:");

	@OriginalMember(owner = "client!acz", name = "fq", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_172 = new Class74("shake:", "schütteln:", "tremblement:", "tremor:", "temblor:");

	@OriginalMember(owner = "client!acz", name = "ff", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_70 = new Class74("scroll:", "scrollen:", "déroulement:", "rolagem:", "desplazar:");

	@OriginalMember(owner = "client!acz", name = "fl", descriptor = "Lclient!acz;")
	public static final Class74 aClass74_174 = new Class74("slide:", "gleiten:", "glissement:", "deslizamento:", "deslizar:");

	@OriginalMember(owner = "client!acz", name = "fb", descriptor = "Lclient!acz;")
	static final Class74 aClass74_175 = new Class74("Friend", "Freund", "Ami", "Amigo", "Amigo");

	@OriginalMember(owner = "client!acz", name = "fo", descriptor = "Ljava/util/Map;")
	final Map aMap4 = new HashMap(7);

	@OriginalMember(owner = "client!acz", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 188)
	Class74(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4) {
		this.aMap4.put(Class717.aClass717_15, arg0);
		this.aMap4.put(Class717.aClass717_16, arg1);
		this.aMap4.put(Class717.aClass717_11, arg2);
		this.aMap4.put(Class717.aClass717_13, arg3);
		this.aMap4.put(Class717.aClass717_10, arg4);
	}

	@OriginalMember(owner = "client!acz", name = "n", descriptor = "(Lclient!zt;)Ljava/lang/String;", line = 198)
	public String method1258(@OriginalArg(0) Class717 arg0) {
		return (String) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!acz", name = "e", descriptor = "(Lclient!zt;B)Ljava/lang/String;", line = 198)
	public String method1259(@OriginalArg(0) Class717 arg0, @OriginalArg(1) byte arg1) {
		return (String) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!acz", name = "m", descriptor = "(Lclient!zt;)Ljava/lang/String;", line = 198)
	public String method1260(@OriginalArg(0) Class717 arg0) {
		return (String) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!acz", name = "i", descriptor = "(IB)V", line = 865)
	static void method1261(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(4) Class93_Sub1_Sub7 local4 = (Class93_Sub1_Sub7) Class454.aClass22_55.method428((byte) 16); local4 != null; local4 = (Class93_Sub1_Sub7) Class454.aClass22_55.method442(123138275)) {
			if (Class702.method36721(local4.anInt3012 * -92627949, (byte) -99) && local4.anInt3009 * -1970204471 >> 16 == arg0) {
				Class632.method32296(local4, -893783590);
			}
		}
	}

	@OriginalMember(owner = "client!acz", name = "ex", descriptor = "(B)V", line = 2193)
	static void method1262(@OriginalArg(0) byte arg0) {
		if (Class694.aClass104_14.method20621()) {
			Class694.aClass104_14.method20444(Class125_Sub3.aCanvas1, 67994844);
			Class84.method1430(-1123473883);
			@Pc(11) Dimension local11 = Class125_Sub3.aCanvas1.getSize();
			Class694.aClass104_14.method20441(Class125_Sub3.aCanvas1, local11.width, local11.height, 25630324);
			Class694.aClass104_14.method20446(Class125_Sub3.aCanvas1, (byte) 14);
		} else {
			Class543.method30945(Class51.options.aClass166_Sub4_2.method15426((byte) 47), false, 1945646779);
		}
		Class635.method32440((short) 255);
	}
}
