package org.manalith.irc.model;

import org.eclipse.swt.widgets.Display;
import org.pircbotx.hooks.Listener;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.ActionEvent;
import org.pircbotx.hooks.events.ChannelInfoEvent;
import org.pircbotx.hooks.events.ConnectEvent;
import org.pircbotx.hooks.events.DisconnectEvent;
import org.pircbotx.hooks.events.FileTransferFinishedEvent;
import org.pircbotx.hooks.events.FingerEvent;
import org.pircbotx.hooks.events.HalfOpEvent;
import org.pircbotx.hooks.events.IncomingChatRequestEvent;
import org.pircbotx.hooks.events.IncomingFileTransferEvent;
import org.pircbotx.hooks.events.InviteEvent;
import org.pircbotx.hooks.events.JoinEvent;
import org.pircbotx.hooks.events.KickEvent;
import org.pircbotx.hooks.events.MessageEvent;
import org.pircbotx.hooks.events.ModeEvent;
import org.pircbotx.hooks.events.MotdEvent;
import org.pircbotx.hooks.events.NickChangeEvent;
import org.pircbotx.hooks.events.NoticeEvent;
import org.pircbotx.hooks.events.OpEvent;
import org.pircbotx.hooks.events.OwnerEvent;
import org.pircbotx.hooks.events.PartEvent;
import org.pircbotx.hooks.events.PingEvent;
import org.pircbotx.hooks.events.PrivateMessageEvent;
import org.pircbotx.hooks.events.QuitEvent;
import org.pircbotx.hooks.events.RemoveChannelBanEvent;
import org.pircbotx.hooks.events.RemoveChannelKeyEvent;
import org.pircbotx.hooks.events.RemoveChannelLimitEvent;
import org.pircbotx.hooks.events.RemoveInviteOnlyEvent;
import org.pircbotx.hooks.events.RemoveModeratedEvent;
import org.pircbotx.hooks.events.RemoveNoExternalMessagesEvent;
import org.pircbotx.hooks.events.RemovePrivateEvent;
import org.pircbotx.hooks.events.RemoveSecretEvent;
import org.pircbotx.hooks.events.RemoveTopicProtectionEvent;
import org.pircbotx.hooks.events.ServerPingEvent;
import org.pircbotx.hooks.events.ServerResponseEvent;
import org.pircbotx.hooks.events.SetChannelBanEvent;
import org.pircbotx.hooks.events.SetChannelKeyEvent;
import org.pircbotx.hooks.events.SetChannelLimitEvent;
import org.pircbotx.hooks.events.SetInviteOnlyEvent;
import org.pircbotx.hooks.events.SetModeratedEvent;
import org.pircbotx.hooks.events.SetNoExternalMessagesEvent;
import org.pircbotx.hooks.events.SetPrivateEvent;
import org.pircbotx.hooks.events.SetSecretEvent;
import org.pircbotx.hooks.events.SetTopicProtectionEvent;
import org.pircbotx.hooks.events.SuperOpEvent;
import org.pircbotx.hooks.events.TimeEvent;
import org.pircbotx.hooks.events.TopicEvent;
import org.pircbotx.hooks.events.UnknownEvent;
import org.pircbotx.hooks.events.UserListEvent;
import org.pircbotx.hooks.events.UserModeEvent;
import org.pircbotx.hooks.events.VersionEvent;
import org.pircbotx.hooks.events.VoiceEvent;
import org.pircbotx.hooks.types.GenericCTCPCommand;
import org.pircbotx.hooks.types.GenericChannelModeEvent;
import org.pircbotx.hooks.types.GenericDCCEvent;
import org.pircbotx.hooks.types.GenericMessageEvent;
import org.pircbotx.hooks.types.GenericUserModeEvent;

public class MockConnectionListener extends ListenerAdapter implements Listener {
	private void appendText(final String text) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				//do something
				//styledText.append(text + "\n");
			}
		});
	}

	public void onAction(ActionEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onChannelInfo(ChannelInfoEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onConnect(ConnectEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onDisconnect(DisconnectEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onFileTransferFinished(FileTransferFinishedEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onFinger(FingerEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onHalfOp(HalfOpEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onIncomingChatRequest(IncomingChatRequestEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onIncomingFileTransfer(IncomingFileTransferEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onInvite(InviteEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onJoin(JoinEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onKick(KickEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onMessage(MessageEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onMode(ModeEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onMotd(MotdEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onNickChange(NickChangeEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onNotice(NoticeEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onOp(OpEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onOwner(OwnerEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onPart(PartEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onPing(PingEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onPrivateMessage(PrivateMessageEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onQuit(QuitEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemoveChannelBan(RemoveChannelBanEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemoveChannelKey(RemoveChannelKeyEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemoveChannelLimit(RemoveChannelLimitEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemoveInviteOnly(RemoveInviteOnlyEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemoveModerated(RemoveModeratedEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemoveNoExternalMessages(RemoveNoExternalMessagesEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemovePrivate(RemovePrivateEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemoveSecret(RemoveSecretEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onRemoveTopicProtection(RemoveTopicProtectionEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onServerPing(ServerPingEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onServerResponse(ServerResponseEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetChannelBan(SetChannelBanEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetChannelKey(SetChannelKeyEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetChannelLimit(SetChannelLimitEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetInviteOnly(SetInviteOnlyEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetModerated(SetModeratedEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetNoExternalMessages(SetNoExternalMessagesEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetPrivate(SetPrivateEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetSecret(SetSecretEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSetTopicProtection(SetTopicProtectionEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onSuperOp(SuperOpEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onTime(TimeEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onTopic(TopicEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onUnknown(UnknownEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onUserList(UserListEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onUserMode(UserModeEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onVersion(VersionEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onVoice(VoiceEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onGenericCTCPCommand(GenericCTCPCommand event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onGenericUserMode(GenericUserModeEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onGenericChannelMode(GenericChannelModeEvent event)
			throws Exception {
		appendText(event.getClass().getName());
	}

	public void onGenericDCC(GenericDCCEvent event) throws Exception {
		appendText(event.getClass().getName());
	}

	public void onGenericMessage(GenericMessageEvent event) throws Exception {
		appendText(event.getClass().getName());
	}
}
