package com.jagex.game.client;

import com.jagex.core.constants.Language;
import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("acz")
public class LocalisedText {

	@ObfuscatedName("acz.e")
	public static final LocalisedText DEBUG_CONSOLE_INFO = new LocalisedText("This is the developer console. To close, press the ALT-`, ALT-² or ALT-§ keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten ALT+`, ALT+² oder ALT+§ drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches ALT+`, ALT+² ou ALT+§.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione ALT-`, ALT-² ou ALT-§.", "Esta es la consola de desarrolador. Para cerrarla, pulsa las teclas ALT-`, ALT-² or ALT-§ en tu teclado.");

	@ObfuscatedName("acz.n")
	public static final LocalisedText DEBUG_CONSOLE_ERROR = new LocalisedText("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s'est produite lors de l'exécution de la commande.", "Houve um erro quando o comando foi executado.", "Se produjo un error al ejecutar el comando.");

	@ObfuscatedName("acz.m")
	public static final LocalisedText DEVELOPER_CONSOLE_SHORTCUT_INFO = new LocalisedText("The developer console can be accessed with ALT-`, ALT-§ or ALT-².", "Die Entwicklerkonsole kann mit ALT+`, ALT+§ oder ALT+² aktiviert werden.", "La console de développement est accessible grâce aux touches ALT+`, ALT+§ ou ALT+².", "O painel de controle do desenvolvedor pode ser acessado com ALT-`, ALT-§ ou ALT-².", "Puedes acceder a la consola de desarrollador con ALT-`, ALT-§ o ALT-².");

	@ObfuscatedName("acz.k")
	public static final LocalisedText DEBUG_CONSOLE_UNKNOWNCOMMAND = new LocalisedText("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ", "Comando desconocido: ");

	@ObfuscatedName("acz.f")
	public static final LocalisedText CANCEL = new LocalisedText("Cancel", "Abbrechen", "Annuler", "Cancelar", "Cancelar");

	@ObfuscatedName("acz.w")
	public static final LocalisedText NO_NAME_PLAYERNAME = new LocalisedText("#Player", "#Spieler", "#Joueur", "#Jogador", "#Jugador");

	@ObfuscatedName("acz.l")
	public static final LocalisedText MEMBERS_DESC = new LocalisedText("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.", "Accede a un servidor para miembros para usar este objeto.");

	@ObfuscatedName("acz.u")
	public static final LocalisedText SWAP_NOTE_AT_BANK = new LocalisedText("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.", "Cambia este vale en cualquier banco por el objeto equivalente.");

	@ObfuscatedName("acz.z")
	public static final LocalisedText LENT_ITEM_RETURN = new LocalisedText("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");

	@ObfuscatedName("acz.p")
	public static final LocalisedText BOUGHT_ITEM_DISCARD = new LocalisedText("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");

	@ObfuscatedName("acz.d")
	public static final LocalisedText field8988 = new LocalisedText("Combine ", "Kombiniere ", "Vous pouvez combiner ", "Você pode trocar ", "Puedes combinar ");

	@ObfuscatedName("acz.c")
	public static final LocalisedText field8957 = new LocalisedText(" shards of this type to receive a ", " dieser Fragmente, um folgenden Gegenstand herzustellen: ", " de ces fragments pour obtenir l'objet suivant : ", " desses fragmentos pelo seguinte objeto: ", " de estos fragmentos para obtener el siguiente objeto: ");

	@ObfuscatedName("acz.r")
	public static final LocalisedText SHARD_ITEM_COMBINE = new LocalisedText("Combine", "Kombinieren", "Combiner", "Combinar", "Combinar");

	@ObfuscatedName("acz.v")
	public static final LocalisedText TAKE = new LocalisedText("Take", "Nehmen", "Prendre", "Pegar", "Agarrar");

	@ObfuscatedName("acz.o")
	public static final LocalisedText DROP = new LocalisedText("Drop", "Fallen lassen", "Poser", "Largar", "Dejar");

	@ObfuscatedName("acz.s")
	public static final LocalisedText OK = new LocalisedText("Ok", "Okay", "OK", "Ok", "OK");

	@ObfuscatedName("acz.y")
	public static final LocalisedText SELECT = new LocalisedText("Select", "Auswählen", "Sélectionner", "Selecionar", "Seleccionar");

	@ObfuscatedName("acz.q")
	public static final LocalisedText CONTINUE = new LocalisedText("Continue", "Weiter", "Continuer", "Continuar", "Continuar");

	@ObfuscatedName("acz.x")
	public static final LocalisedText INVALID_PLAYER_NAME = new LocalisedText("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.", "Nombre de jugador no válido.");

	@ObfuscatedName("acz.b")
	public static final LocalisedText YOU_CANT_REPORT_YOURSELF = new LocalisedText("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!", "¡No te puedes denunciar a ti mismo!");

	@ObfuscatedName("acz.h")
	public static final LocalisedText YOU_ALREADY_SENT_A_SNAPSHOT1 = new LocalisedText("You have sent too many abuse reports today! Do not abuse this system!", "Du hast heute schon zu viele Regelverstöße gemeldet! Missbrauch das System nicht!", "Vous avez signalé trop d’abus pour aujourd’hui. N’abusez pas de ce système !", "Você já denunciou abuso muitas vezes hoje. Não abuse do sistema!", "¡Ya has denunciado demasiadas infracciones hoy! ¡No abuses del sistema!");

	@ObfuscatedName("acz.a")
	public static final LocalisedText YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION1 = new LocalisedText("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por um membro da equipe Jagex, pois ela faz parte da equipe.", "Esa persona es miembro del personal de Jagex, no puedes denunciarla por suplantación de identidad.");

	@ObfuscatedName("acz.g")
	public static final LocalisedText YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION2 = new LocalisedText("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada ao lado de seu nome.", "Los moderadores de Jagex tienen una corona dorada a un lado del nombre.");

	@ObfuscatedName("acz.i")
	public static final LocalisedText YOU_CANNOT_REPORT_STAFF_FOR_IMPERSONATION3 = new LocalisedText("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você pode denunciar essa pessoa por outro tipo de infração.", "Puedes denunciar a esa persona por otro tipo de infracción.");

	@ObfuscatedName("acz.j")
	public static final LocalisedText ABUSE_REPORT_RECEIVED = new LocalisedText("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.", "Gracias, hemos recibido tu denuncia.");

	@ObfuscatedName("acz.t")
	public static final LocalisedText UNABLE_TO_SEND_SNAPSHOT_BUSY = new LocalisedText("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.", "Sistema ocupado. No ha sido posible enviar tu denuncia.");

	@ObfuscatedName("acz.ae")
	public static final LocalisedText INVALID_NAME = new LocalisedText("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido", "Nombre no válido");

	@ObfuscatedName("acz.ag")
	public static final LocalisedText USE_MEMBERS_SERVER_ITEM = new LocalisedText("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.", "Accede a un servidor para miembros para usar este objeto.");

	@ObfuscatedName("acz.ah")
	public static final LocalisedText USE_MEMBERS_SERVER_LOCATION = new LocalisedText("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.", "Para interactuar, accede a un servidor para miembros.");

	@ObfuscatedName("acz.al")
	public static final LocalisedText NOTHING_INTERESTING_HAPPENS = new LocalisedText("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.", "No sucede nada interesante.");

	@ObfuscatedName("acz.ac")
	public static final LocalisedText I_CANT_REACH_THAT = new LocalisedText("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.", "No puedes alcanzar eso.");

	@ObfuscatedName("acz.ai")
	public static final LocalisedText INVALID_TELEPORT = new LocalisedText("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!", "¡Teletransporte no válido!");

	@ObfuscatedName("acz.aw")
	public static final LocalisedText USE_MEMBERS_SERVER_COORD = new LocalisedText("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.", "Para entrar aquí, debes acceder a un servidor para miembros.");

	@ObfuscatedName("acz.as")
	public static final LocalisedText UNABLE_TO_ADD_FRIEND_SYSTEM = new LocalisedText("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.", "Sistema ocupado. No es posible añadir a un amigo.");

	@ObfuscatedName("acz.at")
	public static final LocalisedText UNABLE_TO_ADD_FRIEND_EXISTS = new LocalisedText("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar esse amigo - jogador desconhecido.", "Jugador desconocido. No es posible añadir a ese amigo.");

	@ObfuscatedName("acz.ad")
	public static final LocalisedText UNABLE_TO_ADD_IGNORE_SYSTEM = new LocalisedText("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.", "Sistema ocupado. No es posible añadir el nombre.");

	@ObfuscatedName("acz.am")
	public static final LocalisedText UNABLE_TO_ADD_IGNORE_EXISTS = new LocalisedText("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar esse nome - jogador desconhecido.", "Jugador desconocido. No es posible añadir el nombre.");

	@ObfuscatedName("acz.au")
	public static final LocalisedText FRIENDLIST_FULL_MEMBERS = new LocalisedText("Your friends list is full (400 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 400 erreicht.", "Votre liste d'amis est pleine (400 noms maximum).", "Sua lista de amigos está cheia. O limite é de 400 nomes.", "Tu lista de amigos está llena. El límite es de 400 amigos.");

	@ObfuscatedName("acz.ar")
	public static final LocalisedText FRIENDLIST_FULL = new LocalisedText("Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Votre liste d'amis est pleine (200 noms maximum).", "Sua lista de amigos está cheia. O limite é de 200 nomes.", "Tu lista de amigos está llena. El límite es de 200 amigos.");

	@ObfuscatedName("acz.ap")
	public static final LocalisedText UNABLE_TO_DELETE_FRIEND = new LocalisedText("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.", "Servidor ocupado. No es posible borrar al amigo.");

	@ObfuscatedName("acz.aq")
	public static final LocalisedText UNABLE_TO_DELETE_IGNORE = new LocalisedText("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.", "Sistema ocupado. No es posible borrar el nombre.");

	@ObfuscatedName("acz.ax")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_BUSY = new LocalisedText("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.", "Sistema ocupado. No es posible enviar el mensaje.");

	@ObfuscatedName("acz.av")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_UNAVAILABLE1 = new LocalisedText("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.", "No es posible enviar el mensaje, el jugador no está disponible.");

	@ObfuscatedName("acz.ao")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_UNAVAILABLE2 = new LocalisedText(null, "der Spieler ist momentan nicht verfügbar.", null, null, null);

	@ObfuscatedName("acz.aj")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_NOTFRIEND1 = new LocalisedText("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.", "No es posible enviar el mensaje. El jugador no está en tu lista de amigos.");

	@ObfuscatedName("acz.ay")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_NOTFRIEND2 = new LocalisedText(null, "Spieler nicht auf deiner Freunde-Liste.", null, null, null);

	@ObfuscatedName("acz.ab")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_PASSWORD_A = new LocalisedText("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!", "Parece que le estás revelando a alguien tu contraseña. ¡No debes hacerlo!");

	@ObfuscatedName("acz.az")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_PASSWORD_B = new LocalisedText("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!", "¡Si no es así, cambia tu contraseña por una menos evidente!");

	@ObfuscatedName("acz.aa")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_NO_DISPLAYNAME_1 = new LocalisedText("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "Não é possível enviar a mensagem. Defina um nome de personagem primeiro, fazendo login no jogo.", "No es posible enviar el mensaje. Registra primero un nombre de personaje conectándote al juego.");

	@ObfuscatedName("acz.af")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_NO_DISPLAYNAME_2 = new LocalisedText(null, "indem du dich ins Spiel einloggst.", null, null, null);

	@ObfuscatedName("acz.ak")
	public static final LocalisedText SNAPSHOT_BUFFER_EMPTY1 = new LocalisedText("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.", "Sólo puedes denunciar por esa regla a jugadores que hayan hablado o comerciado recientemente.");

	@ObfuscatedName("acz.an")
	public static final LocalisedText SNAPSHOT_BUFFER_EMPTY2 = new LocalisedText(null, "die kürzlich gesprochen oder gehandelt haben.", null, null, null);

	@ObfuscatedName("acz.bf")
	public static final LocalisedText NAMEDIALOG_NOTFOUND = new LocalisedText("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.", "Este jugador está desconectado o activó el modo de privacidad.");

	@ObfuscatedName("acz.bl")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_QUICKCHAT1 = new LocalisedText("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.", "En estos momentos no puedes enviar un mensaje rápido de chat a un jugador en este mundo.");

	@ObfuscatedName("acz.bk")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_QUICKCHAT2 = new LocalisedText(null, "geschickt werden.", null, null, null);

	@ObfuscatedName("acz.bh")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_QUICKCHATWORLD1 = new LocalisedText("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.", "Este jugador no puede recibir su mensaje porque está en un mundo de chat rápido.");

	@ObfuscatedName("acz.bx")
	public static final LocalisedText CHAT_DISABLED = new LocalisedText("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado", "Chat desactivado");

	@ObfuscatedName("acz.bd")
	public static final LocalisedText UNDER13_FRIENDSCHAT_PREFIX = new LocalisedText("friends_chat", "friends_chat", "friends_chat", "friends_chat", "friends_chat");

	@ObfuscatedName("acz.bc")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_NOT_IN_FRIENDS_CHAT = new LocalisedText("You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "Vous ne faites pas partie d'un canal de discussion.", "No momento, você não está no bate-papo entre amigos.", "Actualmente no estás en un canal de chat entre amigos.");

	@ObfuscatedName("acz.bi")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_FRIENDS_CHAT_TOO_LOW_RANK = new LocalisedText("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de discussion.", "Você não está autorizado a falar neste bate-papo entre amigos.", "No estás autorizado a hablar en este canal de chat entre amigos.");

	@ObfuscatedName("acz.bn")
	public static final LocalisedText UNABLE_TO_SEND_MESSAGE_FRIENDS_CHAT_ERROR = new LocalisedText("Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi de ce message – veuillez réessayer ultérieurement !", "Erro ao enviar mensagem para bate-papo entre amigos - tente novamente mais tarde!", "Se ha producido un error al enviar un mensaje al chat entre amigos, por favor, inténtalo más tarde.");

	@ObfuscatedName("acz.bt")
	public static final LocalisedText FRIENDS_CHAT_STILL_IN_CHANNEL = new LocalisedText("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.", "Por favor, espera hasta haberte desconectado del anterior chat.");

	@ObfuscatedName("acz.bq")
	public static final LocalisedText FRIENDS_CHAT_NOT_IN_CHANNEL = new LocalisedText("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.", "En este momento no estás en un canal.");

	@ObfuscatedName("acz.bm")
	public static final LocalisedText FRIENDS_CHAT_ATTEMPTING_JOIN = new LocalisedText("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...", "Intentando acceder a un canal...");

	@ObfuscatedName("acz.bb")
	public static final LocalisedText FRIENDS_CHAT_SENDING_LEAVE_REQ = new LocalisedText("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para sair do canal...", "Enviando solicitud para abandonar el canal...");

	@ObfuscatedName("acz.be")
	public static final LocalisedText FRIENDS_CHAT_JOIN_IN_PROGRESS = new LocalisedText("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...", "Ya estás intentando unirte a un canal. Por favor, espera...");

	@ObfuscatedName("acz.by")
	public static final LocalisedText FRIENDS_CHAT_LEAVE_IN_PROGRESS = new LocalisedText("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...", "La salida del canal está procesándose. Por favor, espera...");

	@ObfuscatedName("acz.bu")
	public static final LocalisedText FRIENDS_CHAT_INVALID_NAME = new LocalisedText("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!", "¡Nombre de canal no valido!");

	@ObfuscatedName("acz.bw")
	public static final LocalisedText FRIENDS_CHAT_NOT_AVAILABLE = new LocalisedText("Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", "Não foi possível entrar no bate-papo entre amigos - tente novamente mais tarde!", "Ahora mismo no es posible unirse al chat entre amigos. ¡Por favor, inténtalo más tarde!");

	@ObfuscatedName("acz.bo")
	public static final LocalisedText FRIENDS_CHAT_JOIN_SUCCESS_A = new LocalisedText("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ", "Falando agora no bate-papo entre amigos: ", "Hablando ahora en el chat entre amigos: ");

	@ObfuscatedName("acz.bz")
	public static final LocalisedText FRIENDS_CHAT_JOIN_SUCCESS_A_U13 = new LocalisedText("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Vous participez actuellement au canal de discussion du joueur : ", "Falando agora no bate-papo entre amigos do jogador: ", "Hablando ahora en el canal de chat entre amigos del jugador: ");

	@ObfuscatedName("acz.bv")
	public static final LocalisedText FRIENDS_CHAT_JOIN_ERROR = new LocalisedText("Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !", "Erro ao participar do bate-papo entre amigos - tente novamente mais tarde!", "Se ha producido un error al acceder al canal de chat entre amigos. ¡Por favor, inténtalo más tarde!");

	@ObfuscatedName("acz.br")
	public static final LocalisedText FRIENDS_CHAT_JOIN_ATTACKBLOCKED = new LocalisedText("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente novamente mais tarde!", "De momento tienes bloqueado el acceso a los canales chat. ¡Inténtalo de nuevo más tarde!");

	@ObfuscatedName("acz.bg")
	public static final LocalisedText FRIENDS_CHAT_JOIN_NOTEXIST = new LocalisedText("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.", "El canal al que intentas unirte no existe.");

	@ObfuscatedName("acz.ba")
	public static final LocalisedText FRIENDS_CHAT_JOIN_ROOMFULL = new LocalisedText("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.", "El canal al que intentas unirte está lleno en estos momentos.");

	@ObfuscatedName("acz.bp")
	public static final LocalisedText FRIENDS_CHAT_JOIN_LOWRANK = new LocalisedText("You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de discussion.", "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.", "No tienes rango suficiente para unirte a este canal de chat entre amigos.");

	@ObfuscatedName("acz.bj")
	public static final LocalisedText FRIENDS_CHAT_JOIN_BANNED = new LocalisedText("You are temporarily banned from this friends chat channel.", "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.", "Vous avez été exclu temporairement de ce canal de discussion.", "Você foi temporariamente banido deste bate-papo entre amigos.", "Tienes bloqueado temporalmente el acceso a este chat entre amigos.");

	@ObfuscatedName("acz.bs")
	public static final LocalisedText FRIENDS_CHAT_JOIN_IGNORELIST = new LocalisedText("You are not allowed to join this user's friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.", "Você não pode entrar nesse bate-papo entre amigos deste usuário.", "No tienes permiso para acceder al canal de chat entre amigos de este usuario.");

	@ObfuscatedName("acz.cl")
	public static final LocalisedText FRIENDS_CHAT_USER_JOINED = new LocalisedText(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.", " se ha unido al canal.");

	@ObfuscatedName("acz.cg")
	public static final LocalisedText FRIENDS_CHAT_USER_LEFT = new LocalisedText(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " saiu do canal.", " ha abandonado el canal.");

	@ObfuscatedName("acz.ce")
	public static final LocalisedText FRIENDS_CHAT_USER_KICKED = new LocalisedText(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.", " ha sido expulsado del canal.");

	@ObfuscatedName("acz.cu")
	public static final LocalisedText FRIENDS_CHAT_LEAVE_KICKED = new LocalisedText("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.", "Se te ha expulsado del canal.");

	@ObfuscatedName("acz.ci")
	public static final LocalisedText FRIENDS_CHAT_LEAVE_REMOVED = new LocalisedText("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.", "Se te ha eliminado de este canal.");

	@ObfuscatedName("acz.cn")
	public static final LocalisedText FRIENDS_CHAT_LEAVE_DEFAULT = new LocalisedText("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.", "Has salido del canal.");

	@ObfuscatedName("acz.cv")
	public static final LocalisedText FRIENDS_CHAT_ENABLED_A = new LocalisedText("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "Votre canal de discussion est maintenant activé !", "O seu bate-papo entre amigos foi ativado!", "¡Tu canal de chat entre amigos está activado!");

	@ObfuscatedName("acz.cp")
	public static final LocalisedText FRIENDS_CHAT_ENABLED_B = new LocalisedText("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ", "Para entrar en tu canal, haz clic sobre 'Participar' e introduce: ");

	@ObfuscatedName("acz.ca")
	public static final LocalisedText FRIENDS_CHAT_DISABLED = new LocalisedText("Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "Votre canal de discussion est maintenant désactivé !", "O seu bate-papo entre amigos foi desativado!", "¡Tu canal de chat entre amigos ha sido desactivado!");

	@ObfuscatedName("acz.cx")
	public static final LocalisedText FRIENDS_CHAT_KICK_LOW_RANK = new LocalisedText("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.", "No tienes autorización para expulsar a usuarios de este canal.");

	@ObfuscatedName("acz.cw")
	public static final LocalisedText FRIENDS_CHAT_KICK_USER_HIGHER = new LocalisedText("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.", "No tienes autorización para expulsar a este usuario.");

	@ObfuscatedName("acz.ct")
	public static final LocalisedText FRIENDS_CHAT_KICK_NOT_FOUND = new LocalisedText("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.", "Ese usuario no está en este canal.");

	@ObfuscatedName("acz.cf")
	public static final LocalisedText FRIENDS_CHAT_KICK_SUCCESS = new LocalisedText("Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Votre demande d'exclusion de ce joueur a été acceptée.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.", "Tu petición de expulsar/suspender a este usuario ha sido aceptada.");

	@ObfuscatedName("acz.co")
	public static final LocalisedText FRIENDS_CHAT_KICK_SUCCESS_RESET = new LocalisedText("Your request to refresh this user's temporary ban was successful.", "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.", "Le renouvellement d'exclusion temporaire de ce joueur a été accepté.", "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.", "Tu petición de prolongar la suspensión temporal de este usuario ha sido aceptada.");

	@ObfuscatedName("acz.cr")
	public static final LocalisedText MUTED_TEMPORARY = new LocalisedText("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.", "Se te ha vetado temporalmente por haber violado una regla.");

	@ObfuscatedName("acz.cm")
	public static final LocalisedText MUTED_TEMPORARY_TIME_A = new LocalisedText("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ", "Este veto permancereá activo todavía durante ");

	@ObfuscatedName("acz.cq")
	public static final LocalisedText MUTED_TEMPORARY_TIME_B = new LocalisedText(" days.", " Tage.", " jours.", " dias.", " días.");

	@ObfuscatedName("acz.ch")
	public static final LocalisedText MUTED_TEMPORARY_1DAY = new LocalisedText("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.", "Tu veto se retirará dentro de las próximas 24 horas.");

	@ObfuscatedName("acz.cb")
	public static final LocalisedText MUTED_PREVENT = new LocalisedText("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.", "Para evitar otro veto, consulta el reglamento.");

	@ObfuscatedName("acz.cs")
	public static final LocalisedText MUTED_PERMANENT = new LocalisedText("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.", "Se te ha vetado permanentemente por haber violado una regla.");

	@ObfuscatedName("acz.cy")
	public static final LocalisedText LOADING = new LocalisedText("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.", "Cargando. Por favor, espera.");

	@ObfuscatedName("acz.cc")
	public static final LocalisedText PROFILING = new LocalisedText("Profiling...", "Profiling...", "Profilage...", "Definindo perfil...", "Obteniendo perfil...");

	@ObfuscatedName("acz.cz")
	public static final LocalisedText CONLOST = new LocalisedText("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.", "Conexión perdida.");

	@ObfuscatedName("acz.ck")
	public static final LocalisedText ATTEMPT_TO_REESTABLISH = new LocalisedText("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.", "Estamos intentando restablecer la conexión. Por favor, espera.");

	@ObfuscatedName("acz.cj")
	public static final LocalisedText CHECKING_FOR_UPDATES = new LocalisedText("Checking for updates", "Suche nach Updates", "Vérification des mises à jour", "Verificando atualizações", "Buscando actualizaciones");

	@ObfuscatedName("acz.cd")
	public static final LocalisedText DOWNLOADING_UPDATES = new LocalisedText("Fetching Updates", "Lade Update", "Chargement des MAJ", "Carregando atualizações", "Cargando actualizaciones");

	@ObfuscatedName("acz.dd")
	public static final LocalisedText MAINLOAD110 = new LocalisedText("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ", "Cargando configuración - ");

	@ObfuscatedName("acz.dr")
	public static final LocalisedText MAINLOAD110B = new LocalisedText("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada", "Configuración cargada");

	@ObfuscatedName("acz.da")
	public static final LocalisedText MAINLOAD120 = new LocalisedText("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ", "Cargando sprites - ");

	@ObfuscatedName("acz.dt")
	public static final LocalisedText MAINLOAD120B = new LocalisedText("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados", "Sprites cargados");

	@ObfuscatedName("acz.do")
	public static final LocalisedText MAINLOAD130 = new LocalisedText("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ", "Cargando el módulo de texto - ");

	@ObfuscatedName("acz.dz")
	public static final LocalisedText MAINLOAD130B = new LocalisedText("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado", "Módulo de texto cargado");

	@ObfuscatedName("acz.dv")
	public static final LocalisedText MAINLOAD140 = new LocalisedText("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ", "Cargando interfaces - ");

	@ObfuscatedName("acz.dm")
	public static final LocalisedText MAINLOAD140B = new LocalisedText("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas", "Interfaces cargadas");

	@ObfuscatedName("acz.dq")
	public static final LocalisedText MAINLOAD150 = new LocalisedText("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando scripts de interface - ", "Cargando guión de interfaz - ");

	@ObfuscatedName("acz.dc")
	public static final LocalisedText MAINLOAD150B = new LocalisedText("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Script de interface carregados", "Guiones de interfaz cargados");

	@ObfuscatedName("acz.di")
	public static final LocalisedText MAINLOAD160 = new LocalisedText("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes adicionais - ", "Cargando fuentes adicionales - ");

	@ObfuscatedName("acz.dk")
	public static final LocalisedText MAINLOAD160B = new LocalisedText("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes adicionais carregadas", "Fuentes adicionales cargadas");

	@ObfuscatedName("acz.dn")
	public static final LocalisedText MAINLOAD170 = new LocalisedText("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ", "Cargando mapamundi - ");

	@ObfuscatedName("acz.df")
	public static final LocalisedText MAINLOAD170B = new LocalisedText("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado", "Mapamundi cargado");

	@ObfuscatedName("acz.dw")
	public static final LocalisedText MAINLOAD180 = new LocalisedText("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos", "Cargando datos de la lista de mundos");

	@ObfuscatedName("acz.ds")
	public static final LocalisedText MAINLOAD180B = new LocalisedText("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados", "Datos de la lista de mundos cargados");

	@ObfuscatedName("acz.du")
	public static final LocalisedText MAINLOAD190B = new LocalisedText("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas", "Variables de cliente cargadas");

	@ObfuscatedName("acz.dl")
	public static final LocalisedText LOADINGDOTDOTDOT = new LocalisedText("Loading...", "Lade...", "Chargement en cours...", "Carregando...", "Cargando...");

	@ObfuscatedName("acz.dp")
	public static final LocalisedText SNAPSHOT_PLEASECLOSE1 = new LocalisedText("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", "Cierra la interfaz que tienes abierta antes de usar el botón 'Denunciar abuso'.");

	@ObfuscatedName("acz.dy")
	public static final LocalisedText SNAPSHOT_PLEASECLOSE2 = new LocalisedText(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null, null);

	@ObfuscatedName("acz.db")
	public static final LocalisedText SYSTEMUPDATE = new LocalisedText("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ", "Actualización del sistema en: ");

	@ObfuscatedName("acz.dh")
	public static final LocalisedText FRIENDLOGIN = new LocalisedText(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.", " se ha conectado.");

	@ObfuscatedName("acz.dx")
	public static final LocalisedText FRIENDLOGOUT = new LocalisedText(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.", " se ha desconectado.");

	@ObfuscatedName("acz.dg")
	public static final LocalisedText UNABLETOFIND = new LocalisedText("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não foi possível encontrar ", "No es posible encontrar a ");

	@ObfuscatedName("acz.de")
	public static final LocalisedText USE = new LocalisedText("Use", "Benutzen", "Utiliser", "Usar", "Usar");

	@ObfuscatedName("acz.dj")
	public static final LocalisedText EXAMINE = new LocalisedText("Examine", "Untersuchen", "Examiner", "Examinar", "Examinar");

	@ObfuscatedName("acz.eo")
	public static final LocalisedText ATTACK = new LocalisedText("Attack", "Angreifen", "Attaquer", "Atacar", "Atacar");

	@ObfuscatedName("acz.ey")
	public static final LocalisedText CHOOSEOPTION = new LocalisedText("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção", "Seleccionar opción");

	@ObfuscatedName("acz.eu")
	public static final LocalisedText MOREOPTIONS = new LocalisedText(" more options", " weitere Optionen", " autres options", " mais opções", " más opciones");

	@ObfuscatedName("acz.ed")
	public static final LocalisedText WALKHERE = new LocalisedText("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá", "Venir acá");

	@ObfuscatedName("acz.ee")
	public static final LocalisedText FACEHERE = new LocalisedText("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá", "Girar hacia acá");

	@ObfuscatedName("acz.es")
	public static final LocalisedText LEVEL = new LocalisedText("level: ", "Stufe: ", "niveau ", "nível: ", "nivel: ");

	@ObfuscatedName("acz.ei")
	public static final LocalisedText SKILL = new LocalisedText("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ", "habilidad: ");

	@ObfuscatedName("acz.el")
	public static final LocalisedText RATING = new LocalisedText("rating: ", "Kampfstufe: ", "classement ", "qualificação: ", "clasificación: ");

	@ObfuscatedName("acz.ej")
	public static final LocalisedText PLEASEWAIT = new LocalisedText("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...", "Por favor, espera...");

	@ObfuscatedName("acz.ep")
	public static final LocalisedText CLOSE = new LocalisedText("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", "Cierra la interfaz que tienes abierta antes de usar el botón 'Denunciar abuso'.");

	@ObfuscatedName("acz.ev")
	public static final LocalisedText MINISEPERATOR = new LocalisedText(" ", ": ", " ", " ", " ");

	@ObfuscatedName("acz.ec")
	public static final LocalisedText MILLION = new LocalisedText("M", "M", "M", "M", "M");

	@ObfuscatedName("acz.ek")
	public static final LocalisedText MILLION_SHORT = new LocalisedText("M", "M", "M", "M", "M");

	@ObfuscatedName("acz.em")
	public static final LocalisedText THOUSAND = new LocalisedText("K", "T", "K", "K", "K");

	@ObfuscatedName("acz.eh")
	public static final LocalisedText THOUSAND_SHORT = new LocalisedText("K", "T", "K", "K", "K");

	@ObfuscatedName("acz.eq")
	public static final LocalisedText FROM = new LocalisedText("From", "Von:", "De", "De", "De");

	@ObfuscatedName("acz.eg")
	public static final LocalisedText SELF = new LocalisedText("Self", "Mich", "Moi", "Eu", "Mí");

	@ObfuscatedName("acz.ez")
	public static final LocalisedText FRIENDLISTDUPE = new LocalisedText(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.", " ya está en tu lista de amigos.");

	@ObfuscatedName("acz.ef")
	public static final LocalisedText IGNORELISTFULL_MEMBERS = new LocalisedText("Your ignore list is full. Max of 400 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 400 Spieler darauf eintragen.", "Votre liste noire est pleine (400 noms maximum).", "Sua lista de ignorados está cheia. O limite é de 400 usuários.", "Tu lista de jugadores ignorados está llena, el límite es de 400.");

	@ObfuscatedName("acz.et")
	public static final LocalisedText IGNORELISTFULL = new LocalisedText("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é de 100 usuários.", "Tu lista de jugadores ignorados está llena, el límite es de 100.");

	@ObfuscatedName("acz.ea")
	public static final LocalisedText IGNORELISTDUPE = new LocalisedText(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.", " ya está en tu lista de ignorados.");

	@ObfuscatedName("acz.ew")
	public static final LocalisedText FRIENDCANTADDSELF = new LocalisedText("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.", "No puedes añadirte a tu propia lista de amigos.");

	@ObfuscatedName("acz.er")
	public static final LocalisedText IGNORECANTADDSELF = new LocalisedText("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.", "No puedes añadirte a tu propia lista de ignorados.");

	@ObfuscatedName("acz.en")
	public static final LocalisedText FRIENDLIST_TIMED_SAVE = new LocalisedText("Changes will take effect on your friends chat in the next 60 seconds.", "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.", "Les modifications seront apportées à votre canal de discussion dans les 60 prochaines secondes.", "As mudanças acontecerão em seu bate-papo entre amigos nos próximos 60 segundos.", "Los cambios en tu chat de amigos se realizarán en los próximos 60 segundos.");

	@ObfuscatedName("acz.eb")
	public static final LocalisedText REMOVEIGNORE1 = new LocalisedText("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");

	@ObfuscatedName("acz.ex")
	public static final LocalisedText REMOVEIGNORE2 = new LocalisedText(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.", " de tu lista de ignorados.");

	@ObfuscatedName("acz.fg")
	public static final LocalisedText REMOVEFRIEND1 = new LocalisedText("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");

	@ObfuscatedName("acz.fm")
	public static final LocalisedText REMOVEFRIEND2 = new LocalisedText(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.", " de tu lista de amigos.");

	@ObfuscatedName("acz.fu")
	public static final LocalisedText CHATCOL0 = new LocalisedText("yellow:", "gelb:", "jaune:", "amarelo:", "amarillo:");

	@ObfuscatedName("acz.fs")
	public static final LocalisedText CHATCOL1 = new LocalisedText("red:", "rot:", "rouge:", "vermelho:", "rojo:");

	@ObfuscatedName("acz.fz")
	public static final LocalisedText CHATCOL2 = new LocalisedText("green:", "grün:", "vert:", "verde:", "verde:");

	@ObfuscatedName("acz.fj")
	public static final LocalisedText CHATCOL3 = new LocalisedText("cyan:", "blaugrün:", "cyan:", "ciano:", "cian:");

	@ObfuscatedName("acz.fd")
	public static final LocalisedText CHATCOL4 = new LocalisedText("purple:", "lila:", "violet:", "roxo:", "violeta:");

	@ObfuscatedName("acz.fn")
	public static final LocalisedText CHATCOL5 = new LocalisedText("white:", "weiss:", "blanc:", "branco:", "blanco:");

	@ObfuscatedName("acz.fi")
	public static final LocalisedText CHATCOL6 = new LocalisedText("flash1:", "blinken1:", "clignotant1:", "flash1:", "parpadeante1:");

	@ObfuscatedName("acz.ft")
	public static final LocalisedText CHATCOL7 = new LocalisedText("flash2:", "blinken2:", "clignotant2:", "flash2:", "parpadeante2:");

	@ObfuscatedName("acz.fx")
	public static final LocalisedText CHATCOL8 = new LocalisedText("flash3:", "blinken3:", "clignotant3:", "flash3:", "parpadeante3:");

	@ObfuscatedName("acz.fv")
	public static final LocalisedText CHATCOL9 = new LocalisedText("glow1:", "leuchten1:", "brillant1:", "brilho1:", "brillante1:");

	@ObfuscatedName("acz.fc")
	public static final LocalisedText CHATCOL10 = new LocalisedText("glow2:", "leuchten2:", "brillant2:", "brilho2:", "brillante2:");

	@ObfuscatedName("acz.fw")
	public static final LocalisedText CHATCOL11 = new LocalisedText("glow3:", "leuchten3:", "brillant3:", "brilho3:", "brillante3:");

	@ObfuscatedName("acz.fa")
	public static final LocalisedText CHATEFFECT1 = new LocalisedText("wave:", "welle:", "ondulation:", "onda:", "onda:");

	@ObfuscatedName("acz.fp")
	public static final LocalisedText CHATEFFECT2 = new LocalisedText("wave2:", "welle2:", "ondulation2:", "onda2:", "onda2:");

	@ObfuscatedName("acz.fq")
	public static final LocalisedText CHATEFFECT3 = new LocalisedText("shake:", "schütteln:", "tremblement:", "tremor:", "temblor:");

	@ObfuscatedName("acz.ff")
	public static final LocalisedText CHATEFFECT4 = new LocalisedText("scroll:", "scrollen:", "déroulement:", "rolagem:", "desplazar:");

	@ObfuscatedName("acz.fl")
	public static final LocalisedText CHATEFFECT5 = new LocalisedText("slide:", "gleiten:", "glissement:", "deslizamento:", "deslizar:");

	@ObfuscatedName("acz.fb")
	public static final LocalisedText UNKNOWN_FRIEND_DISPLAYNAME_PLACEHOLDER = new LocalisedText("Friend", "Freund", "Ami", "Amigo", "Amigo");

	@ObfuscatedName("acz.fo")
	public final Map texts = new HashMap(7);

	public LocalisedText(String english, String german, String french, String portuguese, String spanish) {
		this.texts.put(Language.EN, english);
		this.texts.put(Language.DE, german);
		this.texts.put(Language.FR, french);
		this.texts.put(Language.PT, portuguese);
		this.texts.put(Language.ES_MX, spanish);
	}

	@ObfuscatedName("acz.e(Lzt;B)Ljava/lang/String;")
	public String forLang(Language language) {
		return (String) this.texts.get(language);
	}
}
