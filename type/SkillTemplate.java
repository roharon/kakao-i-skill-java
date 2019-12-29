package com.roharon.huformationi.wrapper.type;

import com.roharon.huformationi.wrapper.component.Component;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkillTemplate {

    final private Character MAX_OUTPUTS_SIZE = 3;
    final private Character MIN_OUTPUTS_SIZE = 1;
    final private Character MAX_QUICKREPLY_SIZE = 10;

    @Singular("addOutput")
    private List<Component> outputs;
    @Singular("addQuickReply")
    private List<QuickReply> quickReplies;

    public void addOutputs(Component ou){

        if(this.outputs.size() + 1 > MAX_OUTPUTS_SIZE){
            throw new IndexOutOfBoundsException("outputs size must be at least 1 and no more than 3.");
        }

        this.outputs.add(ou);
    }

    public void initOutputs(){

        this.outputs = new ArrayList<Component>();
    }

    public void setOutputs(ArrayList<Component> outputs){

        if(outputs.size() > MAX_OUTPUTS_SIZE){
            throw new IndexOutOfBoundsException("outputs size must be at least 1 and no more than 3.");
        }
        this.outputs = outputs;
    }


    public void addQuickReply(){

        if(this.quickReplies.size() + 1 > MAX_QUICKREPLY_SIZE){
            throw new IndexOutOfBoundsException("quickReplies size must be no more than 10.");
        }
    }

    public void initQuickReplies(){
        this.quickReplies = new ArrayList<QuickReply>();
    }

    public void setQuickReplies(ArrayList<QuickReply> qreply){

        if(qreply.size() > MAX_QUICKREPLY_SIZE){
            throw new IndexOutOfBoundsException("quickReplies size must be no more than 10.");
        }
        this.quickReplies = qreply;
    }
}
