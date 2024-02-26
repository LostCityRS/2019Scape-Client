package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@OriginalClass("client!ack")
public final class Class60 {

	@OriginalMember(owner = "client!ack", name = "t", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_102 = new Class60("This is the developer console. To close, press the ALT-`, ALT-² or ALT-§ keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten ALT+`, ALT+² oder ALT+§ drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches ALT+`, ALT+² ou ALT+§.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione ALT-`, ALT-² ou ALT-§.", "Esta es la consola de desarrolador. Para cerrarla, pulsa las teclas ALT-`, ALT-² or ALT-§ en tu teclado.");

	@OriginalMember(owner = "client!ack", name = "f", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_2 = new Class60("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s'est produite lors de l'exécution de la commande.", "Houve um erro quando o comando foi executado.", "Se produjo un error al ejecutar el comando.");

	@OriginalMember(owner = "client!ack", name = "e", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_3 = new Class60("The developer console can be accessed with ALT-`, ALT-§ or ALT-².", "Die Entwicklerkonsole kann mit ALT+`, ALT+§ oder ALT+² aktiviert werden.", "La console de développement est accessible grâce aux touches ALT+`, ALT+§ ou ALT+².", "O painel de controle do desenvolvedor pode ser acessado com ALT-`, ALT-§ ou ALT-².", "Puedes acceder a la consola de desarrollador con ALT-`, ALT-§ o ALT-².");

	@OriginalMember(owner = "client!ack", name = "u", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_71 = new Class60("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ", "Comando desconocido: ");

	@OriginalMember(owner = "client!ack", name = "l", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_91 = new Class60("Cancel", "Abbrechen", "Annuler", "Cancelar", "Cancelar");

	@OriginalMember(owner = "client!ack", name = "g", descriptor = "Lclient!ack;")
	static final Class60 aClass60_16 = new Class60("#Player", "#Spieler", "#Joueur", "#Jogador", "#Jugador");

	@OriginalMember(owner = "client!ack", name = "i", descriptor = "Lclient!ack;")
	static final Class60 aClass60_31 = new Class60("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.", "Accede a un servidor para miembros para usar este objeto.");

	@OriginalMember(owner = "client!ack", name = "m", descriptor = "Lclient!ack;")
	static final Class60 aClass60_8 = new Class60("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.", "Cambia este vale en cualquier banco por el objeto equivalente.");

	@OriginalMember(owner = "client!ack", name = "o", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_42 = new Class60("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");

	@OriginalMember(owner = "client!ack", name = "j", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_10 = new Class60("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");

	@OriginalMember(owner = "client!ack", name = "a", descriptor = "Lclient!ack;")
	static final Class60 aClass60_5 = new Class60("Combine ", "Kombiniere ", "Vous pouvez combiner ", "Você pode trocar ", "Puedes combinar ");

	@OriginalMember(owner = "client!ack", name = "s", descriptor = "Lclient!ack;")
	static final Class60 aClass60_12 = new Class60(" shards of this type to receive a ", " dieser Fragmente, um folgenden Gegenstand herzustellen: ", " de ces fragments pour obtenir l'objet suivant : ", " desses fragmentos pelo seguinte objeto: ", " de estos fragmentos para obtener el siguiente objeto: ");

	@OriginalMember(owner = "client!ack", name = "k", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_13 = new Class60("Combine", "Kombinieren", "Combiner", "Combinar", "Combinar");

	@OriginalMember(owner = "client!ack", name = "x", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_82 = new Class60("Take", "Nehmen", "Prendre", "Pegar", "Agarrar");

	@OriginalMember(owner = "client!ack", name = "w", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_15 = new Class60("Drop", "Fallen lassen", "Poser", "Largar", "Dejar");

	@OriginalMember(owner = "client!ack", name = "r", descriptor = "Lclient!ack;")
	static final Class60 aClass60_147 = new Class60("Ok", "Okay", "OK", "Ok", "OK");

	@OriginalMember(owner = "client!ack", name = "q", descriptor = "Lclient!ack;")
	static final Class60 aClass60_17 = new Class60("Select", "Auswählen", "Sélectionner", "Selecionar", "Seleccionar");

	@OriginalMember(owner = "client!ack", name = "h", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_18 = new Class60("Continue", "Weiter", "Continuer", "Continuar", "Continuar");

	@OriginalMember(owner = "client!ack", name = "d", descriptor = "Lclient!ack;")
	static final Class60 aClass60_114 = new Class60("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.", "Nombre de jugador no válido.");

	@OriginalMember(owner = "client!ack", name = "z", descriptor = "Lclient!ack;")
	static final Class60 aClass60_20 = new Class60("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!", "¡No te puedes denunciar a ti mismo!");

	@OriginalMember(owner = "client!ack", name = "p", descriptor = "Lclient!ack;")
	static final Class60 aClass60_85 = new Class60("You have sent too many abuse reports today! Do not abuse this system!", "Du hast heute schon zu viele Regelverstöße gemeldet! Missbrauch das System nicht!", "Vous avez signalé trop d’abus pour aujourd’hui. N’abusez pas de ce système !", "Você já denunciou abuso muitas vezes hoje. Não abuse do sistema!", "¡Ya has denunciado demasiadas infracciones hoy! ¡No abuses del sistema!");

	@OriginalMember(owner = "client!ack", name = "v", descriptor = "Lclient!ack;")
	static final Class60 aClass60_22 = new Class60("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por um membro da equipe Jagex, pois ela faz parte da equipe.", "Esa persona es miembro del personal de Jagex, no puedes denunciarla por suplantación de identidad.");

	@OriginalMember(owner = "client!ack", name = "y", descriptor = "Lclient!ack;")
	static final Class60 aClass60_23 = new Class60("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada ao lado de seu nome.", "Los moderadores de Jagex tienen una corona dorada a un lado del nombre.");

	@OriginalMember(owner = "client!ack", name = "n", descriptor = "Lclient!ack;")
	static final Class60 aClass60_153 = new Class60("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você pode denunciar essa pessoa por outro tipo de infração.", "Puedes denunciar a esa persona por otro tipo de infracción.");

	@OriginalMember(owner = "client!ack", name = "c", descriptor = "Lclient!ack;")
	static final Class60 aClass60_41 = new Class60("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.", "Gracias, hemos recibido tu denuncia.");

	@OriginalMember(owner = "client!ack", name = "b", descriptor = "Lclient!ack;")
	static final Class60 aClass60_26 = new Class60("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.", "Sistema ocupado. No ha sido posible enviar tu denuncia.");

	@OriginalMember(owner = "client!ack", name = "ax", descriptor = "Lclient!ack;")
	static final Class60 aClass60_27 = new Class60("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido", "Nombre no válido");

	@OriginalMember(owner = "client!ack", name = "ay", descriptor = "Lclient!ack;")
	static final Class60 aClass60_28 = new Class60("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.", "Accede a un servidor para miembros para usar este objeto.");

	@OriginalMember(owner = "client!ack", name = "ai", descriptor = "Lclient!ack;")
	static final Class60 aClass60_169 = new Class60("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.", "Para interactuar, accede a un servidor para miembros.");

	@OriginalMember(owner = "client!ack", name = "aq", descriptor = "Lclient!ack;")
	static final Class60 aClass60_30 = new Class60("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.", "No sucede nada interesante.");

	@OriginalMember(owner = "client!ack", name = "ao", descriptor = "Lclient!ack;")
	static final Class60 aClass60_174 = new Class60("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.", "No puedes alcanzar eso.");

	@OriginalMember(owner = "client!ack", name = "aj", descriptor = "Lclient!ack;")
	static final Class60 aClass60_32 = new Class60("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!", "¡Teletransporte no válido!");

	@OriginalMember(owner = "client!ack", name = "ac", descriptor = "Lclient!ack;")
	static final Class60 aClass60_33 = new Class60("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.", "Para entrar aquí, debes acceder a un servidor para miembros.");

	@OriginalMember(owner = "client!ack", name = "ag", descriptor = "Lclient!ack;")
	static final Class60 aClass60_34 = new Class60("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.", "Sistema ocupado. No es posible añadir a un amigo.");

	@OriginalMember(owner = "client!ack", name = "ab", descriptor = "Lclient!ack;")
	static final Class60 aClass60_35 = new Class60("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar esse amigo - jogador desconhecido.", "Jugador desconocido. No es posible añadir a ese amigo.");

	@OriginalMember(owner = "client!ack", name = "al", descriptor = "Lclient!ack;")
	static final Class60 aClass60_36 = new Class60("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.", "Sistema ocupado. No es posible añadir el nombre.");

	@OriginalMember(owner = "client!ack", name = "ah", descriptor = "Lclient!ack;")
	static final Class60 aClass60_159 = new Class60("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar esse nome - jogador desconhecido.", "Jugador desconocido. No es posible añadir el nombre.");

	@OriginalMember(owner = "client!ack", name = "af", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_38 = new Class60("Your friends list is full (400 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 400 erreicht.", "Votre liste d'amis est pleine (400 noms maximum).", "Sua lista de amigos está cheia. O limite é de 400 nomes.", "Tu lista de amigos está llena. El límite es de 400 amigos.");

	@OriginalMember(owner = "client!ack", name = "am", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_39 = new Class60("Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Votre liste d'amis est pleine (200 noms maximum).", "Sua lista de amigos está cheia. O limite é de 200 nomes.", "Tu lista de amigos está llena. El límite es de 200 amigos.");

	@OriginalMember(owner = "client!ack", name = "ak", descriptor = "Lclient!ack;")
	static final Class60 aClass60_40 = new Class60("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.", "Servidor ocupado. No es posible borrar al amigo.");

	@OriginalMember(owner = "client!ack", name = "at", descriptor = "Lclient!ack;")
	static final Class60 aClass60_45 = new Class60("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.", "Sistema ocupado. No es posible borrar el nombre.");

	@OriginalMember(owner = "client!ack", name = "ad", descriptor = "Lclient!ack;")
	static final Class60 aClass60_126 = new Class60("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.", "Sistema ocupado. No es posible enviar el mensaje.");

	@OriginalMember(owner = "client!ack", name = "av", descriptor = "Lclient!ack;")
	static final Class60 aClass60_29 = new Class60("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.", "No es posible enviar el mensaje, el jugador no está disponible.");

	@OriginalMember(owner = "client!ack", name = "an", descriptor = "Lclient!ack;")
	static final Class60 aClass60_44 = new Class60(null, "der Spieler ist momentan nicht verfügbar.", null, null, null);

	@OriginalMember(owner = "client!ack", name = "aa", descriptor = "Lclient!ack;")
	static final Class60 aClass60_166 = new Class60("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.", "No es posible enviar el mensaje. El jugador no está en tu lista de amigos.");

	@OriginalMember(owner = "client!ack", name = "ae", descriptor = "Lclient!ack;")
	static final Class60 aClass60_138 = new Class60(null, "Spieler nicht auf deiner Freunde-Liste.", null, null, null);

	@OriginalMember(owner = "client!ack", name = "ap", descriptor = "Lclient!ack;")
	static final Class60 aClass60_47 = new Class60("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!", "Parece que le estás revelando a alguien tu contraseña. ¡No debes hacerlo!");

	@OriginalMember(owner = "client!ack", name = "ar", descriptor = "Lclient!ack;")
	static final Class60 aClass60_48 = new Class60("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!", "¡Si no es así, cambia tu contraseña por una menos evidente!");

	@OriginalMember(owner = "client!ack", name = "au", descriptor = "Lclient!ack;")
	static final Class60 aClass60_49 = new Class60("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "Não é possível enviar a mensagem. Defina um nome de personagem primeiro, fazendo login no jogo.", "No es posible enviar el mensaje. Registra primero un nombre de personaje conectándote al juego.");

	@OriginalMember(owner = "client!ack", name = "az", descriptor = "Lclient!ack;")
	static final Class60 aClass60_50 = new Class60(null, "indem du dich ins Spiel einloggst.", null, null, null);

	@OriginalMember(owner = "client!ack", name = "as", descriptor = "Lclient!ack;")
	static final Class60 aClass60_51 = new Class60("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.", "Sólo puedes denunciar por esa regla a jugadores que hayan hablado o comerciado recientemente.");

	@OriginalMember(owner = "client!ack", name = "aw", descriptor = "Lclient!ack;")
	static final Class60 aClass60_52 = new Class60(null, "die kürzlich gesprochen oder gehandelt haben.", null, null, null);

	@OriginalMember(owner = "client!ack", name = "bg", descriptor = "Lclient!ack;")
	static final Class60 aClass60_53 = new Class60("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.", "Este jugador está desconectado o activó el modo de privacidad.");

	@OriginalMember(owner = "client!ack", name = "bl", descriptor = "Lclient!ack;")
	static final Class60 aClass60_54 = new Class60("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.", "En estos momentos no puedes enviar un mensaje rápido de chat a un jugador en este mundo.");

	@OriginalMember(owner = "client!ack", name = "br", descriptor = "Lclient!ack;")
	static final Class60 aClass60_11 = new Class60(null, "geschickt werden.", null, null, null);

	@OriginalMember(owner = "client!ack", name = "bn", descriptor = "Lclient!ack;")
	static final Class60 aClass60_4 = new Class60("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.", "Este jugador no puede recibir su mensaje porque está en un mundo de chat rápido.");

	@OriginalMember(owner = "client!ack", name = "ba", descriptor = "Lclient!ack;")
	static final Class60 aClass60_57 = new Class60("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado", "Chat desactivado");

	@OriginalMember(owner = "client!ack", name = "bt", descriptor = "Lclient!ack;")
	static final Class60 aClass60_58 = new Class60("friends_chat", "friends_chat", "friends_chat", "friends_chat", "friends_chat");

	@OriginalMember(owner = "client!ack", name = "bs", descriptor = "Lclient!ack;")
	static final Class60 aClass60_150 = new Class60("You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "Vous ne faites pas partie d'un canal de discussion.", "No momento, você não está no bate-papo entre amigos.", "Actualmente no estás en un canal de chat entre amigos.");

	@OriginalMember(owner = "client!ack", name = "bj", descriptor = "Lclient!ack;")
	static final Class60 aClass60_60 = new Class60("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de discussion.", "Você não está autorizado a falar neste bate-papo entre amigos.", "No estás autorizado a hablar en este canal de chat entre amigos.");

	@OriginalMember(owner = "client!ack", name = "by", descriptor = "Lclient!ack;")
	static final Class60 aClass60_61 = new Class60("Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi de ce message – veuillez réessayer ultérieurement !", "Erro ao enviar mensagem para bate-papo entre amigos - tente novamente mais tarde!", "Se ha producido un error al enviar un mensaje al chat entre amigos, por favor, inténtalo más tarde.");

	@OriginalMember(owner = "client!ack", name = "bk", descriptor = "Lclient!ack;")
	static final Class60 aClass60_73 = new Class60("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.", "Por favor, espera hasta haberte desconectado del anterior chat.");

	@OriginalMember(owner = "client!ack", name = "bz", descriptor = "Lclient!ack;")
	static final Class60 aClass60_119 = new Class60("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.", "En este momento no estás en un canal.");

	@OriginalMember(owner = "client!ack", name = "be", descriptor = "Lclient!ack;")
	static final Class60 aClass60_64 = new Class60("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...", "Intentando acceder a un canal...");

	@OriginalMember(owner = "client!ack", name = "bh", descriptor = "Lclient!ack;")
	static final Class60 aClass60_65 = new Class60("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para sair do canal...", "Enviando solicitud para abandonar el canal...");

	@OriginalMember(owner = "client!ack", name = "bv", descriptor = "Lclient!ack;")
	static final Class60 aClass60_66 = new Class60("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...", "Ya estás intentando unirte a un canal. Por favor, espera...");

	@OriginalMember(owner = "client!ack", name = "bp", descriptor = "Lclient!ack;")
	static final Class60 aClass60_67 = new Class60("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...", "La salida del canal está procesándose. Por favor, espera...");

	@OriginalMember(owner = "client!ack", name = "bb", descriptor = "Lclient!ack;")
	static final Class60 aClass60_68 = new Class60("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!", "¡Nombre de canal no valido!");

	@OriginalMember(owner = "client!ack", name = "bo", descriptor = "Lclient!ack;")
	static final Class60 aClass60_69 = new Class60("Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", "Não foi possível entrar no bate-papo entre amigos - tente novamente mais tarde!", "Ahora mismo no es posible unirse al chat entre amigos. ¡Por favor, inténtalo más tarde!");

	@OriginalMember(owner = "client!ack", name = "bc", descriptor = "Lclient!ack;")
	static final Class60 aClass60_63 = new Class60("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ", "Falando agora no bate-papo entre amigos: ", "Hablando ahora en el chat entre amigos: ");

	@OriginalMember(owner = "client!ack", name = "bf", descriptor = "Lclient!ack;")
	static final Class60 aClass60_37 = new Class60("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Vous participez actuellement au canal de discussion du joueur : ", "Falando agora no bate-papo entre amigos do jogador: ", "Hablando ahora en el canal de chat entre amigos del jugador: ");

	@OriginalMember(owner = "client!ack", name = "bw", descriptor = "Lclient!ack;")
	static final Class60 aClass60_6 = new Class60("Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !", "Erro ao participar do bate-papo entre amigos - tente novamente mais tarde!", "Se ha producido un error al acceder al canal de chat entre amigos. ¡Por favor, inténtalo más tarde!");

	@OriginalMember(owner = "client!ack", name = "bx", descriptor = "Lclient!ack;")
	static final Class60 aClass60_7 = new Class60("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente novamente mais tarde!", "De momento tienes bloqueado el acceso a los canales chat. ¡Inténtalo de nuevo más tarde!");

	@OriginalMember(owner = "client!ack", name = "bi", descriptor = "Lclient!ack;")
	static final Class60 aClass60_74 = new Class60("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.", "El canal al que intentas unirte no existe.");

	@OriginalMember(owner = "client!ack", name = "bu", descriptor = "Lclient!ack;")
	static final Class60 aClass60_75 = new Class60("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.", "El canal al que intentas unirte está lleno en estos momentos.");

	@OriginalMember(owner = "client!ack", name = "bm", descriptor = "Lclient!ack;")
	static final Class60 aClass60_76 = new Class60("You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de discussion.", "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.", "No tienes rango suficiente para unirte a este canal de chat entre amigos.");

	@OriginalMember(owner = "client!ack", name = "bq", descriptor = "Lclient!ack;")
	static final Class60 aClass60_156 = new Class60("You are temporarily banned from this friends chat channel.", "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.", "Vous avez été exclu temporairement de ce canal de discussion.", "Você foi temporariamente banido deste bate-papo entre amigos.", "Tienes bloqueado temporalmente el acceso a este chat entre amigos.");

	@OriginalMember(owner = "client!ack", name = "bd", descriptor = "Lclient!ack;")
	static final Class60 aClass60_78 = new Class60("You are not allowed to join this user's friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.", "Você não pode entrar nesse bate-papo entre amigos deste usuário.", "No tienes permiso para acceder al canal de chat entre amigos de este usuario.");

	@OriginalMember(owner = "client!ack", name = "cd", descriptor = "Lclient!ack;")
	static final Class60 aClass60_1 = new Class60(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.", " se ha unido al canal.");

	@OriginalMember(owner = "client!ack", name = "cv", descriptor = "Lclient!ack;")
	static final Class60 aClass60_80 = new Class60(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " saiu do canal.", " ha abandonado el canal.");

	@OriginalMember(owner = "client!ack", name = "ct", descriptor = "Lclient!ack;")
	static final Class60 aClass60_24 = new Class60(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.", " ha sido expulsado del canal.");

	@OriginalMember(owner = "client!ack", name = "cn", descriptor = "Lclient!ack;")
	static final Class60 aClass60_176 = new Class60("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.", "Se te ha expulsado del canal.");

	@OriginalMember(owner = "client!ack", name = "cy", descriptor = "Lclient!ack;")
	static final Class60 aClass60_83 = new Class60("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.", "Se te ha eliminado de este canal.");

	@OriginalMember(owner = "client!ack", name = "ch", descriptor = "Lclient!ack;")
	static final Class60 aClass60_84 = new Class60("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.", "Has salido del canal.");

	@OriginalMember(owner = "client!ack", name = "cc", descriptor = "Lclient!ack;")
	static final Class60 aClass60_168 = new Class60("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "Votre canal de discussion est maintenant activé !", "O seu bate-papo entre amigos foi ativado!", "¡Tu canal de chat entre amigos está activado!");

	@OriginalMember(owner = "client!ack", name = "cu", descriptor = "Lclient!ack;")
	static final Class60 aClass60_14 = new Class60("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ", "Para entrar en tu canal, haz clic sobre 'Participar' e introduce: ");

	@OriginalMember(owner = "client!ack", name = "ce", descriptor = "Lclient!ack;")
	static final Class60 aClass60_87 = new Class60("Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "Votre canal de discussion est maintenant désactivé !", "O seu bate-papo entre amigos foi desativado!", "¡Tu canal de chat entre amigos ha sido desactivado!");

	@OriginalMember(owner = "client!ack", name = "cs", descriptor = "Lclient!ack;")
	static final Class60 aClass60_88 = new Class60("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.", "No tienes autorización para expulsar a usuarios de este canal.");

	@OriginalMember(owner = "client!ack", name = "cj", descriptor = "Lclient!ack;")
	static final Class60 aClass60_89 = new Class60("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.", "No tienes autorización para expulsar a este usuario.");

	@OriginalMember(owner = "client!ack", name = "ck", descriptor = "Lclient!ack;")
	static final Class60 aClass60_90 = new Class60("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.", "Ese usuario no está en este canal.");

	@OriginalMember(owner = "client!ack", name = "ca", descriptor = "Lclient!ack;")
	static final Class60 aClass60_117 = new Class60("Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Votre demande d'exclusion de ce joueur a été acceptée.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.", "Tu petición de expulsar/suspender a este usuario ha sido aceptada.");

	@OriginalMember(owner = "client!ack", name = "cr", descriptor = "Lclient!ack;")
	static final Class60 aClass60_92 = new Class60("Your request to refresh this user's temporary ban was successful.", "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.", "Le renouvellement d'exclusion temporaire de ce joueur a été accepté.", "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.", "Tu petición de prolongar la suspensión temporal de este usuario ha sido aceptada.");

	@OriginalMember(owner = "client!ack", name = "ci", descriptor = "Lclient!ack;")
	static final Class60 aClass60_93 = new Class60("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.", "Se te ha vetado temporalmente por haber violado una regla.");

	@OriginalMember(owner = "client!ack", name = "cm", descriptor = "Lclient!ack;")
	static final Class60 aClass60_94 = new Class60("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ", "Este veto permancereá activo todavía durante ");

	@OriginalMember(owner = "client!ack", name = "cp", descriptor = "Lclient!ack;")
	static final Class60 aClass60_95 = new Class60(" days.", " Tage.", " jours.", " dias.", " días.");

	@OriginalMember(owner = "client!ack", name = "cg", descriptor = "Lclient!ack;")
	static final Class60 aClass60_96 = new Class60("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.", "Tu veto se retirará dentro de las próximas 24 horas.");

	@OriginalMember(owner = "client!ack", name = "cb", descriptor = "Lclient!ack;")
	static final Class60 aClass60_97 = new Class60("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.", "Para evitar otro veto, consulta el reglamento.");

	@OriginalMember(owner = "client!ack", name = "cw", descriptor = "Lclient!ack;")
	static final Class60 aClass60_98 = new Class60("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.", "Se te ha vetado permanentemente por haber violado una regla.");

	@OriginalMember(owner = "client!ack", name = "cl", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_99 = new Class60("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.", "Cargando. Por favor, espera.");

	@OriginalMember(owner = "client!ack", name = "cx", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_163 = new Class60("Profiling...", "Profiling...", "Profilage...", "Definindo perfil...", "Obteniendo perfil...");

	@OriginalMember(owner = "client!ack", name = "cf", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_101 = new Class60("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.", "Conexión perdida.");

	@OriginalMember(owner = "client!ack", name = "co", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_105 = new Class60("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.", "Estamos intentando restablecer la conexión. Por favor, espera.");

	@OriginalMember(owner = "client!ack", name = "cz", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_103 = new Class60("Checking for updates", "Suche nach Updates", "Vérification des mises à jour", "Verificando atualizações", "Buscando actualizaciones");

	@OriginalMember(owner = "client!ack", name = "cq", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_124 = new Class60("Fetching Updates", "Lade Update", "Chargement des MAJ", "Carregando atualizações", "Cargando actualizaciones");

	@OriginalMember(owner = "client!ack", name = "dg", descriptor = "Lclient!ack;")
	static final Class60 aClass60_72 = new Class60("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ", "Cargando configuración - ");

	@OriginalMember(owner = "client!ack", name = "dh", descriptor = "Lclient!ack;")
	static final Class60 aClass60_106 = new Class60("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada", "Configuración cargada");

	@OriginalMember(owner = "client!ack", name = "dd", descriptor = "Lclient!ack;")
	static final Class60 aClass60_107 = new Class60("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ", "Cargando sprites - ");

	@OriginalMember(owner = "client!ack", name = "dc", descriptor = "Lclient!ack;")
	static final Class60 aClass60_108 = new Class60("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados", "Sprites cargados");

	@OriginalMember(owner = "client!ack", name = "dn", descriptor = "Lclient!ack;")
	static final Class60 aClass60_109 = new Class60("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ", "Cargando el módulo de texto - ");

	@OriginalMember(owner = "client!ack", name = "df", descriptor = "Lclient!ack;")
	static final Class60 aClass60_110 = new Class60("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado", "Módulo de texto cargado");

	@OriginalMember(owner = "client!ack", name = "dl", descriptor = "Lclient!ack;")
	static final Class60 aClass60_111 = new Class60("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ", "Cargando interfaces - ");

	@OriginalMember(owner = "client!ack", name = "db", descriptor = "Lclient!ack;")
	static final Class60 aClass60_81 = new Class60("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas", "Interfaces cargadas");

	@OriginalMember(owner = "client!ack", name = "dt", descriptor = "Lclient!ack;")
	static final Class60 aClass60_113 = new Class60("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando scripts de interface - ", "Cargando guión de interfaz - ");

	@OriginalMember(owner = "client!ack", name = "du", descriptor = "Lclient!ack;")
	static final Class60 aClass60_104 = new Class60("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Script de interface carregados", "Guiones de interfaz cargados");

	@OriginalMember(owner = "client!ack", name = "ds", descriptor = "Lclient!ack;")
	static final Class60 aClass60_25 = new Class60("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes adicionais - ", "Cargando fuentes adicionales - ");

	@OriginalMember(owner = "client!ack", name = "dw", descriptor = "Lclient!ack;")
	static final Class60 aClass60_116 = new Class60("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes adicionais carregadas", "Fuentes adicionales cargadas");

	@OriginalMember(owner = "client!ack", name = "dr", descriptor = "Lclient!ack;")
	static final Class60 aClass60_129 = new Class60("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ", "Cargando mapamundi - ");

	@OriginalMember(owner = "client!ack", name = "dx", descriptor = "Lclient!ack;")
	static final Class60 aClass60_59 = new Class60("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado", "Mapamundi cargado");

	@OriginalMember(owner = "client!ack", name = "de", descriptor = "Lclient!ack;")
	static final Class60 aClass60_55 = new Class60("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos", "Cargando datos de la lista de mundos");

	@OriginalMember(owner = "client!ack", name = "dv", descriptor = "Lclient!ack;")
	static final Class60 aClass60_120 = new Class60("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados", "Datos de la lista de mundos cargados");

	@OriginalMember(owner = "client!ack", name = "dm", descriptor = "Lclient!ack;")
	static final Class60 aClass60_121 = new Class60("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas", "Variables de cliente cargadas");

	@OriginalMember(owner = "client!ack", name = "dq", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_122 = new Class60("Loading...", "Lade...", "Chargement en cours...", "Carregando...", "Cargando...");

	@OriginalMember(owner = "client!ack", name = "do", descriptor = "Lclient!ack;")
	static final Class60 aClass60_123 = new Class60("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", "Cierra la interfaz que tienes abierta antes de usar el botón 'Denunciar abuso'.");

	@OriginalMember(owner = "client!ack", name = "dp", descriptor = "Lclient!ack;")
	static final Class60 aClass60_46 = new Class60(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null, null);

	@OriginalMember(owner = "client!ack", name = "dj", descriptor = "Lclient!ack;")
	static final Class60 aClass60_125 = new Class60("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ", "Actualización del sistema en: ");

	@OriginalMember(owner = "client!ack", name = "di", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_21 = new Class60(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.", " se ha conectado.");

	@OriginalMember(owner = "client!ack", name = "dz", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_127 = new Class60(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.", " se ha desconectado.");

	@OriginalMember(owner = "client!ack", name = "dy", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_128 = new Class60("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não foi possível encontrar ", "No es posible encontrar a ");

	@OriginalMember(owner = "client!ack", name = "da", descriptor = "Lclient!ack;")
	static final Class60 aClass60_77 = new Class60("Use", "Benutzen", "Utiliser", "Usar", "Usar");

	@OriginalMember(owner = "client!ack", name = "dk", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_9 = new Class60("Examine", "Untersuchen", "Examiner", "Examinar", "Examinar");

	@OriginalMember(owner = "client!ack", name = "ec", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_131 = new Class60("Attack", "Angreifen", "Attaquer", "Atacar", "Atacar");

	@OriginalMember(owner = "client!ack", name = "ev", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_132 = new Class60("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção", "Seleccionar opción");

	@OriginalMember(owner = "client!ack", name = "ed", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_115 = new Class60(" more options", " weitere Optionen", " autres options", " mais opções", " más opciones");

	@OriginalMember(owner = "client!ack", name = "eo", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_134 = new Class60("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá", "Venir acá");

	@OriginalMember(owner = "client!ack", name = "ep", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_133 = new Class60("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá", "Girar hacia acá");

	@OriginalMember(owner = "client!ack", name = "ew", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_136 = new Class60("level: ", "Stufe: ", "niveau ", "nível: ", "nivel: ");

	@OriginalMember(owner = "client!ack", name = "ee", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_137 = new Class60("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ", "habilidad: ");

	@OriginalMember(owner = "client!ack", name = "ef", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_56 = new Class60("rating: ", "Kampfstufe: ", "classement ", "qualificação: ", "clasificación: ");

	@OriginalMember(owner = "client!ack", name = "ez", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_139 = new Class60("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...", "Por favor, espera...");

	@OriginalMember(owner = "client!ack", name = "ey", descriptor = "Lclient!ack;")
	static final Class60 aClass60_140 = new Class60("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", "Cierra la interfaz que tienes abierta antes de usar el botón 'Denunciar abuso'.");

	@OriginalMember(owner = "client!ack", name = "ek", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_141 = new Class60(" ", ": ", " ", " ", " ");

	@OriginalMember(owner = "client!ack", name = "ea", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_162 = new Class60("M", "M", "M", "M", "M");

	@OriginalMember(owner = "client!ack", name = "eh", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_143 = new Class60("M", "M", "M", "M", "M");

	@OriginalMember(owner = "client!ack", name = "el", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_144 = new Class60("K", "T", "K", "K", "K");

	@OriginalMember(owner = "client!ack", name = "em", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_145 = new Class60("K", "T", "K", "K", "K");

	@OriginalMember(owner = "client!ack", name = "et", descriptor = "Lclient!ack;")
	static final Class60 aClass60_146 = new Class60("From", "Von:", "De", "De", "De");

	@OriginalMember(owner = "client!ack", name = "eu", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_43 = new Class60("Self", "Mich", "Moi", "Eu", "Mí");

	@OriginalMember(owner = "client!ack", name = "es", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_148 = new Class60(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.", " ya está en tu lista de amigos.");

	@OriginalMember(owner = "client!ack", name = "er", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_149 = new Class60("Your ignore list is full. Max of 400 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 400 Spieler darauf eintragen.", "Votre liste noire est pleine (400 noms maximum).", "Sua lista de ignorados está cheia. O limite é de 400 usuários.", "Tu lista de jugadores ignorados está llena, el límite es de 400.");

	@OriginalMember(owner = "client!ack", name = "en", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_79 = new Class60("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é de 100 usuários.", "Tu lista de jugadores ignorados está llena, el límite es de 100.");

	@OriginalMember(owner = "client!ack", name = "ex", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_100 = new Class60(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.", " ya está en tu lista de ignorados.");

	@OriginalMember(owner = "client!ack", name = "eg", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_152 = new Class60("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.", "No puedes añadirte a tu propia lista de amigos.");

	@OriginalMember(owner = "client!ack", name = "eb", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_171 = new Class60("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.", "No puedes añadirte a tu propia lista de ignorados.");

	@OriginalMember(owner = "client!ack", name = "ei", descriptor = "Lclient!ack;")
	static final Class60 aClass60_130 = new Class60("Changes will take effect on your friends chat in the next 60 seconds.", "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.", "Les modifications seront apportées à votre canal de discussion dans les 60 prochaines secondes.", "As mudanças acontecerão em seu bate-papo entre amigos nos próximos 60 segundos.", "Los cambios en tu chat de amigos se realizarán en los próximos 60 segundos.");

	@OriginalMember(owner = "client!ack", name = "ej", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_155 = new Class60("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");

	@OriginalMember(owner = "client!ack", name = "eq", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_142 = new Class60(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.", " de tu lista de ignorados.");

	@OriginalMember(owner = "client!ack", name = "fe", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_157 = new Class60("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");

	@OriginalMember(owner = "client!ack", name = "fv", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_158 = new Class60(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.", " de tu lista de amigos.");

	@OriginalMember(owner = "client!ack", name = "fm", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_86 = new Class60("yellow:", "gelb:", "jaune:", "amarelo:", "amarillo:");

	@OriginalMember(owner = "client!ack", name = "fp", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_160 = new Class60("red:", "rot:", "rouge:", "vermelho:", "rojo:");

	@OriginalMember(owner = "client!ack", name = "fx", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_161 = new Class60("green:", "grün:", "vert:", "verde:", "verde:");

	@OriginalMember(owner = "client!ack", name = "fj", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_164 = new Class60("cyan:", "blaugrün:", "cyan:", "ciano:", "cian:");

	@OriginalMember(owner = "client!ack", name = "fq", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_70 = new Class60("purple:", "lila:", "violet:", "roxo:", "violeta:");

	@OriginalMember(owner = "client!ack", name = "fk", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_62 = new Class60("white:", "weiss:", "blanc:", "branco:", "blanco:");

	@OriginalMember(owner = "client!ack", name = "fa", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_165 = new Class60("flash1:", "blinken1:", "clignotant1:", "flash1:", "parpadeante1:");

	@OriginalMember(owner = "client!ack", name = "fz", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_112 = new Class60("flash2:", "blinken2:", "clignotant2:", "flash2:", "parpadeante2:");

	@OriginalMember(owner = "client!ack", name = "fn", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_167 = new Class60("flash3:", "blinken3:", "clignotant3:", "flash3:", "parpadeante3:");

	@OriginalMember(owner = "client!ack", name = "fh", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_151 = new Class60("glow1:", "leuchten1:", "brillant1:", "brilho1:", "brillante1:");

	@OriginalMember(owner = "client!ack", name = "fw", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_19 = new Class60("glow2:", "leuchten2:", "brillant2:", "brilho2:", "brillante2:");

	@OriginalMember(owner = "client!ack", name = "fo", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_170 = new Class60("glow3:", "leuchten3:", "brillant3:", "brilho3:", "brillante3:");

	@OriginalMember(owner = "client!ack", name = "fy", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_118 = new Class60("wave:", "welle:", "ondulation:", "onda:", "onda:");

	@OriginalMember(owner = "client!ack", name = "fb", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_172 = new Class60("wave2:", "welle2:", "ondulation2:", "onda2:", "onda2:");

	@OriginalMember(owner = "client!ack", name = "fd", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_173 = new Class60("shake:", "schütteln:", "tremblement:", "tremor:", "temblor:");

	@OriginalMember(owner = "client!ack", name = "fc", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_135 = new Class60("scroll:", "scrollen:", "déroulement:", "rolagem:", "desplazar:");

	@OriginalMember(owner = "client!ack", name = "fl", descriptor = "Lclient!ack;")
	public static final Class60 aClass60_175 = new Class60("slide:", "gleiten:", "glissement:", "deslizamento:", "deslizar:");

	@OriginalMember(owner = "client!ack", name = "fg", descriptor = "Lclient!ack;")
	static final Class60 aClass60_154 = new Class60("Friend", "Freund", "Ami", "Amigo", "Amigo");

	@OriginalMember(owner = "client!ack", name = "ft", descriptor = "Ljava/util/Map;")
	final Map aMap3 = new HashMap(7);

	@OriginalMember(owner = "client!ack", name = "m", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZB)V")
	public static void method1183(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		if (arg0.length() > 320 || !Class501.method30420(-1371891994)) {
			return;
		}
		Class536.method30873(1221986686);
		Class238.aString154 = arg0;
		Class238.aString155 = arg1;
		Class238.aString153 = arg2;
		Class238.aBoolean770 = arg3;
		Class604.method32148(7, 1924875112);
	}

	@OriginalMember(owner = "client!ack", name = "l", descriptor = "(I)V")
	public static void method1184(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = client.aClass539_1.method30921(1863819885);
		@Pc(7) int local7 = client.aClass539_1.method31011(-1902966483);
		Class123.aBooleanArrayArray17 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!ack", name = "nu", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method1185(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2036062726) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class431.method29089(local13, arg2, 1027145871);
	}

	@OriginalMember(owner = "client!ack", name = "aaq", descriptor = "(Lclient!yp;I)V")
	static void method1186(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class579.method31809(local13, 1780204897);
	}

	@OriginalMember(owner = "client!ack", name = "k", descriptor = "(I)Ljava/awt/Container;")
	public static Container method1187(@OriginalArg(0) int arg0) {
		if (Class411.aFrame2 == null) {
			return Class244.aFrame1 == null ? Class306.anApplet1 : Class244.aFrame1;
		} else {
			return Class411.aFrame2;
		}
	}

	@OriginalMember(owner = "client!ack", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	Class60(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4) {
		this.aMap3.put(Class719.aClass719_4, arg0);
		this.aMap3.put(Class719.aClass719_10, arg1);
		this.aMap3.put(Class719.aClass719_9, arg2);
		this.aMap3.put(Class719.aClass719_5, arg3);
		this.aMap3.put(Class719.aClass719_8, arg4);
	}

	@OriginalMember(owner = "client!ack", name = "e", descriptor = "(Lclient!zv;)Ljava/lang/String;")
	public String method1179(@OriginalArg(0) Class719 arg0) {
		return (String) this.aMap3.get(arg0);
	}

	@OriginalMember(owner = "client!ack", name = "t", descriptor = "(Lclient!zv;I)Ljava/lang/String;")
	public String method1180(@OriginalArg(0) Class719 arg0, @OriginalArg(1) int arg1) {
		return (String) this.aMap3.get(arg0);
	}

	@OriginalMember(owner = "client!ack", name = "f", descriptor = "(Lclient!zv;)Ljava/lang/String;")
	public String method1181(@OriginalArg(0) Class719 arg0) {
		return (String) this.aMap3.get(arg0);
	}

	@OriginalMember(owner = "client!ack", name = "u", descriptor = "(Lclient!zv;)Ljava/lang/String;")
	public String method1182(@OriginalArg(0) Class719 arg0) {
		return (String) this.aMap3.get(arg0);
	}
}
