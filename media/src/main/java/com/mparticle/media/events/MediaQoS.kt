package com.mparticle.media.events

class MediaQoS(
    var startupTime : Long? = null,
    var droppedFrames: Int? = null,
    var bitRate: Int? = null,
    var fps: Int? = null
)