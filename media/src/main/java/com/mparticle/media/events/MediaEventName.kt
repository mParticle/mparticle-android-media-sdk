package com.mparticle.media.events

object MediaEventName {
    const val PLAY = "Play"
    const val PAUSE = "Pause"
    const val SESSION_START = "Media Session Start"
    const val SESSION_END = "Media Session End"
    const val CONTENT_END = "Media Content End"
    const val SEEK_START = "Seek Start"
    const val SEEK_END = "Seek End"
    const val BUFFER_START = "Buffer Start"
    const val BUFFER_END = "Buffer End"
    const val UPDATE_PLAYHEAD_POSITION = "Update Playhead Position"
    const val AD_CLICK = "Ad Click"
    const val AD_BREAK_START = "Ad Break Start"
    const val AD_BREAK_END = "Ad Break End"
    const val AD_START = "Ad Start"
    const val AD_END = "Ad End"
    const val AD_SKIP = "Ad Skip"
    const val SEGMENT_START = "Segment Start"
    const val SEGMENT_END = "Segment End"
    const val SEGMENT_SKIP = "Segment Skip"
    const val UPDATE_QOS = "Update QoS"
    const val ERROR = "Error"
}