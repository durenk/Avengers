/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package saulmm.avengers.injector.components;

import android.content.Context;

import java.util.List;

import dagger.Component;
import saulmm.avengers.injector.Activity;
import saulmm.avengers.injector.modules.ActivityModule;
import saulmm.avengers.injector.modules.AvengersModule;
import saulmm.avengers.model.Character;
import saulmm.avengers.views.activities.AvengersListActivity;

@Activity
@Component(dependencies = AppComponent.class, modules = {AvengersModule.class, ActivityModule.class})
public interface AvengersComponent extends ActivityComponent {

    void inject (AvengersListActivity activity);

    Context activityContext();

    List<Character> avengers();
}
