package com.bloodstrike.lobbyserver.packet.server;

import common.net.APC;

import com.bloodstrike.lobbyserver.ConnetionHandler;

import bean.CommonCharInfo;

@SuppressWarnings("serial")
public class PROTOCOL_FRIEND_OFFLINE_LIST_ACK extends APC {
    public PROTOCOL_FRIEND_OFFLINE_LIST_ACK(ConnetionHandler session) {
        super("onShowOfflineFriend");
        addParameter(CommonCharInfo.getDemoOffline());
    }
}
